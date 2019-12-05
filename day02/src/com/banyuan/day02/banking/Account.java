package com.banyuan.day02.banking;

public class Account {
    private double balance;


    public void setBalance(double init_balance){
        this.balance=init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double a){
        balance+=a;
        System.out.println("Deposit "+balance);
    }

    public void withdraw(double b){
        balance-=b;
        System.out.println("Withdraw "+balance);
    }
}
