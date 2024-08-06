package com.matrix.bank.service;

import org.springframework.stereotype.Service;
import com.matrix.bank.dto.Login;
import com.matrix.bank.entity.User;

@Service
public interface UserService {
public User registerUser(User user);
public String login(Login login);
}
