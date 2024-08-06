package com.matrix.bank.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.matrix.bank.dto.Login;
import com.matrix.bank.dto.Pin;
import com.matrix.bank.entity.Account;
import com.matrix.bank.entity.User;
import com.matrix.bank.repository.AccountRepository;
import com.matrix.bank.repository.UserRepository;
import com.matrix.bank.service.AccountService;
import com.matrix.bank.service.UserService;

@Service
public class UserServiceImpl implements UserService, AccountService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AccountRepository accountRepository;

	public User registerUser(User user) {
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String encryptedPwd = bcrypt.encode(user.getPassword());
		user.setPassword(encryptedPwd);
		createAccount(user);
//		User savedUser = userRepository.save(user);
		return userRepository.save(user);
	}

	@Override
	public void createAccount(User user) {
		Account account = new Account();
		account.setEmail(user.getEmail());
		account.setName(user.getName());
		account.setUser(user);
		accountRepository.save(account);
	}

	public String login(Login login) {
		Account account = accountRepository.findByAccountNumber(login.getAccountNumber())
				.orElseThrow(() -> new RuntimeException("Account not found"));
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		if (bcrypt.matches(login.getPassword(), account.getUser().getPassword())) {
			return "successfull";
		} else {
			throw new RuntimeException("Password incorrect");
		}

	}

	@Override
	public String createPin(Pin pin) {
      Account account=accountRepository.findByAccountNumber(pin.getAccountNumber()).orElseThrow();
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
       if(bcrypt.matches(pin.getPassword(),account.getUser().getPassword())) {
    	  long createdPin=pin.getPin();
    	  account.setPin(createdPin);
    	  accountRepository.save(account);
       }
		return "Pin created successfully";
	}

}
