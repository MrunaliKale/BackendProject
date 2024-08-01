package com.matrix.bank.dto;

import lombok.Data;

@Data
public class Login {
	private Long accountNumber;
    private String password;
}
