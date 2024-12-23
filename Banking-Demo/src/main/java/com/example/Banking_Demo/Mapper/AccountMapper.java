package com.example.Banking_Demo.Mapper;

import com.example.Banking_Demo.dto.AccountDto;
import com.example.Banking_Demo.entity.Account;

public class AccountMapper {

    public static AccountDto mapToAccountDto(Account account) {
        return  new AccountDto(account.getId(), account.getBalance(),account.getAccountHolderName());

    }
public static Account mapToAccount(AccountDto accountDto) {
        return new Account(accountDto.getId(),accountDto.getBalance(), accountDto.getAccountHolderName());
}
}
