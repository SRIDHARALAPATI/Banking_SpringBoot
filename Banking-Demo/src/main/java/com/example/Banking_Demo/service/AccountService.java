package com.example.Banking_Demo.service;

import com.example.Banking_Demo.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountbyId(Long id);
    List<AccountDto> getAllAccounts();
    AccountDto Deposit(Long id, Double amount);



}
