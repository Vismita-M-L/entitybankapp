package com.techlabs.bankapp.entities;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="role")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {
	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleid;
	
	@Column(unique = true)
	private String rolename;

}
