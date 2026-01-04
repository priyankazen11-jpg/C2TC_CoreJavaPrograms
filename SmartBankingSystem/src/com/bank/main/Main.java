package com.bank.main;

import com.bank.model.Account;
import com.bank.service.BankServiceImpl;
import com.bank.thread.TransactionThread;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Smart Multi-Threaded Banking System ===");

        // Step 1: Create Account
        Account account = new Account(101, 5000);

        // Step 2: Create Bank Service
        BankServiceImpl bankService = new BankServiceImpl(account);

        // Step 3: Create Transaction Threads
        TransactionThread t1 =
                new TransactionThread(bankService, 2000, false, "User-1");
        TransactionThread t2 =
                new TransactionThread(bankService, 3000, false, "User-2");
        TransactionThread t3 =
                new TransactionThread(bankService, 4000, true, "User-3");
        TransactionThread t4 =
                new TransactionThread(bankService, 1000, false, "User-4");

        // Step 4: Start Threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Step 5: Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Step 6: Final Balance
        System.out.println("Final Account Balance: ₹" + bankService.getBalance());
    }
}
