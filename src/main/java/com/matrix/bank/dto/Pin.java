package com.matrix.bank.dto;

import lombok.Data;

@Data
public class Pin {
	
	private Long accountNumber;
	private long pin;
	private String password;
}
