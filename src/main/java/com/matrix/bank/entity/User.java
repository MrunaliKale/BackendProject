package com.matrix.bank.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String password;

	@Email
	@NotBlank
	private String email;

	@NotBlank
	private String countryCode;

	@NotBlank
	private String address;
    
	@NotBlank
	@Column(unique = true)
	private long phone_number;
	
	@NotBlank
	private String branch;
	
	@OneToOne(mappedBy="user")
	@Transient
	private Account account;

}
