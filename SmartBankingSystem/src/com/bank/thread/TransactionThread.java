package com.bank.thread;

import com.bank.service.BankServiceImpl;

public class TransactionThread extends Thread {

    private BankServiceImpl bankService;
    private double amount;
    private boolean isDeposit;

    public TransactionThread(
            BankServiceImpl bankService,
            double amount,
            boolean isDeposit,
            String threadName) {

        this.bankService = bankService;
        this.amount = amount;
        this.isDeposit = isDeposit;
        this.setName(threadName);
    }

    @Override
    public void run() {
        if (isDeposit) {
            bankService.deposit(amount);
        } else {
            bankService.withdraw(amount);
        }
    }
}
