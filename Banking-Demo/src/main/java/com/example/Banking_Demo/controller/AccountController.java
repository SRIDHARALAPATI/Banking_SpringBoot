package com.example.Banking_Demo.controller;

import com.example.Banking_Demo.dto.AccountDto;
import com.example.Banking_Demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/Create")
    public ResponseEntity<AccountDto>CreateAccount(@RequestBody AccountDto accountDto){
        AccountDto createdAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(createdAccount, HttpStatus.CREATED);
    }

    @GetMapping("/getAccount/{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable long id) {
        AccountDto account = accountService.getAccountbyId(id);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

}
