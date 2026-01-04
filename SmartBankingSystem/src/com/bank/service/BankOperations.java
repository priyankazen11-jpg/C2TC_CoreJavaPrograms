package com.bank.service;

public interface BankOperations {

    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}
