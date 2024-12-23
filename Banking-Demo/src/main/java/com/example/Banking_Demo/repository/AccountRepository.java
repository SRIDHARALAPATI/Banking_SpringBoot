package com.example.Banking_Demo.repository;

import com.example.Banking_Demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
