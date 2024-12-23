package com.example.Banking_Demo.service;

import com.example.Banking_Demo.Mapper.AccountMapper;
import com.example.Banking_Demo.dto.AccountDto;
import com.example.Banking_Demo.entity.Account;
import com.example.Banking_Demo.repository.AccountRepository;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {

    Account newAccount = AccountMapper.mapToAccount(accountDto);
    Account savedAccount=accountRepository.save(newAccount);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountbyId(Long id) {
        Account account= accountRepository.findById(id).get();
        return AccountMapper.mapToAccountDto(account);
    }

}
