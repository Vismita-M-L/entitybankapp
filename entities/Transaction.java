package com.techlabs.bankapp.entities;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="transaction")
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_id")
	private int transactionid;

	@Column
	private double Amount;
	@Column
	private Date Date;
	
	@Column
	private int SenderAccountNumber;
	
	@Column
	private int ReceiveraccountNumber;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="transactiontype_id")
	private TransactionType transactiontype;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST},fetch=FetchType.LAZY)
	@JoinColumn(name="account_id")
	private Account account;
}
