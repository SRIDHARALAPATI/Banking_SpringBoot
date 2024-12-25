package com.example.Banking_Demo.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AccountDto
{
    private long id;
    private double balance;
    private String accountHolderName;

    public AccountDto(long id,  double balance, String accountHolderName) {
        this.id = id;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
