package com.techlabs.bankapp.entities;



import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="userdetails")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDetails {
	@Id
	@Column(name="userdetails_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	
	@Column(unique = true)
	private String username;
	
	@Column
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="role_id")
	private Role role;
	

}
