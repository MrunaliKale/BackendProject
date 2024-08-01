package com.matrix.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrix.bank.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{


}
