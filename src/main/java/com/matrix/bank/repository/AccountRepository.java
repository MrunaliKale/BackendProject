package com.matrix.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matrix.bank.dto.Login;
import com.matrix.bank.entity.Account;


public interface AccountRepository extends JpaRepository<Account,Long>{
public  Login findByAccountNumber(Long accountNumber);
}
