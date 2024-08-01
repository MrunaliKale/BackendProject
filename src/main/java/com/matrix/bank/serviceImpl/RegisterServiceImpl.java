package com.matrix.bank.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.matrix.bank.dto.Login;
import com.matrix.bank.entity.Account;
import com.matrix.bank.entity.User;
import com.matrix.bank.repository.AccountRepository;
import com.matrix.bank.repository.UserRepository;
import com.matrix.bank.service.AccountService;
import com.matrix.bank.service.UserService;

@Service
public class RegisterServiceImpl implements UserService, AccountService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AccountRepository accountRepository;

	public User registerUser(User user) {
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String encryptedPwd = bcrypt.encode(user.getPassword());
		user.setPassword(encryptedPwd);
		createAccount(user);
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public void createAccount(User user) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setEmail(user.getEmail());
		account.setName(user.getName());
		account.setUser(user);
		accountRepository.save(account);
	}

	@Override
	public void Login(Login login) {
      	
	}

}
