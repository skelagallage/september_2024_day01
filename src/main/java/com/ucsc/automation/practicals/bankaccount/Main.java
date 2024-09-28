package com.ucsc.automation.practicals.bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        Thread[] users = new Thread[10];

        for(int i=0; i<10; i++){
            users[i] = new Thread(new User(bankAccount, String.format("User-%d", i)));
        }

        for(Thread user : users){
            user.start();
        }

        for(int i=0; i<10; i++){
            try {
                users[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Final balance : " + bankAccount.getBalance());

    }
}
