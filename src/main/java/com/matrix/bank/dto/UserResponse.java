package com.matrix.bank.dto;



public class UserResponse {

	private String name;

	private String email;

	private String IFSC_code;

	private Long accountNumber;

	private String branch;

	private String account_type;

	public UserResponse(String name, String email, String iFSC_code, Long accountNumber, String branch,
			String account_type) {
		super();
		this.name = name;
		this.email = email;
		IFSC_code = iFSC_code;
		this.accountNumber = accountNumber;
		this.branch = branch;
		this.account_type = account_type;
	}

}
