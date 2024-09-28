package com.ucsc.automation.practicals.bankaccount;

public class BankAccount {

    public int balance;

    public BankAccount(int initBalance) {
        this.balance = initBalance;
    }

    public void delay(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void deposit(int amount, User user){
        System.out.println(user.getName() + " is going to deposit " + amount);
        int newAmount = balance + amount;
        delay();
        balance = newAmount;
        System.out.println(user.getName() + " deposited " + amount + " successfully.");
    }

    public synchronized void withdraw(int amount, User user){
        System.out.println(user.getName() + " is going to withdraw " + amount);
        if(balance >= amount){
            int newAmount = balance - amount;
            delay();
            balance = newAmount;
            System.out.println(user.getName() + " withdrew " + amount + " successfully.");
        }else {
            System.out.println("Balance is not enough");
        }

    }

    public int getBalance() {
        return balance;
    }
}
