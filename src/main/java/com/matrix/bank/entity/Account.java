package com.matrix.bank.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@Email
	@NotBlank
	private String email;

	@NotBlank
	private Long accountNumber = (long) (Math.random() * Math.pow(10, 10));

	private String IFSC_code = "MAHB001";

//	@Enumerated(EnumType.STRING)
//	private AccountType account_type;

	private String account_type = "savings";

	private String accountStatus;

	private double balance;

	private long Pin;

	@OneToOne(cascade = CascadeType.ALL)
	private User user;

}
