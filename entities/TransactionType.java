package com.techlabs.bankapp.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="transactiontype")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class TransactionType {
	@Id
	@Column(name="transactiontype_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactiotypeid;
	
	@Column(unique = true)
	private String transactiontypename;
	
	
	

}
