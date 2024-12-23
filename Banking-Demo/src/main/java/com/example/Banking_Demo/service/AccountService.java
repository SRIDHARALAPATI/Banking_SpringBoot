package com.example.Banking_Demo.service;

import com.example.Banking_Demo.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountbyId(Long id);

}
