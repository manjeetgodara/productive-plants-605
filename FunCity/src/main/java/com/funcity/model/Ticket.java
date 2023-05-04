package com.funcity.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Ticket{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketId;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "ticket")
	 
	private List<Activity> activities =new ArrayList<>();
	
	
}
