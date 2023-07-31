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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="bank")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Bank {
	@Id
	@Column(name="bank_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bankid;
	
	@Column
	private String bankname;
	
	@Column(unique = true)
	private String abbreviation;
	 
	@Column
	private String address;
	
	@OneToMany(mappedBy = "bank",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},fetch=FetchType.LAZY)
	private List<Account> accounts;
	

}
