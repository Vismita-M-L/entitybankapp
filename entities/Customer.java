package com.techlabs.bankapp.entities;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="customer")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerid;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	
	@OneToOne(cascade=  CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserDetails userdetails;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Account> accounts;

}
