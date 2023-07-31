package com.techlabs.bankapp.entities;

import java.sql.Date;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="account")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="account_id")
	private int accountid;
	
	@Column(unique = true)
	private int accountnumber;
	
	@Column
	private double balance;
	
	@ManyToOne(cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY)
	@JoinColumn(name="Customer_id")
	private Customer customer;
	
	@ManyToOne(cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY)
	@JoinColumn(name="bank_id")
	private Bank bank;
	
	@OneToMany(mappedBy="transaction_id",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY)
	private List<Transaction> transactions;
	
	

}
