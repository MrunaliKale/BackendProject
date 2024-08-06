package com.matrix.bank.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.matrix.bank.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Account> findByAccountNumber(Long accountNumber);
}
