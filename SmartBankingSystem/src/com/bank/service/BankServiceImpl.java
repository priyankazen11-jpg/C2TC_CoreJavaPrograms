package com.bank.service;

import com.bank.model.Account;
import com.bank.exception.InsufficientBalanceException;

public class BankServiceImpl implements BankOperations {

    private Account account;

    // Constructor
    public BankServiceImpl(Account account) {
        this.account = account;
    }

    // Deposit money (thread-safe)
    @Override
    public synchronized void deposit(double amount) {
        double currentBalance = account.getBalance();
        currentBalance = currentBalance + amount;
        account.setBalance(currentBalance);

        System.out.println(
                Thread.currentThread().getName()
                + " deposited ₹" + amount
                + " | Balance: ₹" + account.getBalance()
        );
    }

    // Withdraw money (thread-safe)
    @Override
    public synchronized void withdraw(double amount) {
        try {
            if (account.getBalance() < amount) {
                throw new InsufficientBalanceException("Insufficient balance");
            }

            double currentBalance = account.getBalance();
            currentBalance = currentBalance - amount;
            account.setBalance(currentBalance);

            System.out.println(
                    Thread.currentThread().getName()
                    + " withdrew ₹" + amount
                    + " | Balance: ₹" + account.getBalance()
            );

        } catch (InsufficientBalanceException e) {
            System.out.println(
                    Thread.currentThread().getName()
                    + " failed to withdraw ₹" + amount
                    + " | Reason: " + e.getMessage()
            );
        }
    }

    // Get current balance
    @Override
    public double getBalance() {
        return account.getBalance();
    }
}
