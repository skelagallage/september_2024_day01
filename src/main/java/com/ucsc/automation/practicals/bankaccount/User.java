package com.ucsc.automation.practicals.bankaccount;

public class User implements Runnable {
    private BankAccount bankAccount;
    private String name;

    public User(BankAccount bankAccount, String name) {
        this.bankAccount = bankAccount;
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            bankAccount.deposit(100, this);
            bankAccount.withdraw(50, this);
        }
    }
}
