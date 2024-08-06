package com.matrix.bank.service;

import com.matrix.bank.dto.Pin;
import com.matrix.bank.entity.User;

public interface AccountService {
	public void createAccount(User user);

	public String createPin(Pin pin);

}
