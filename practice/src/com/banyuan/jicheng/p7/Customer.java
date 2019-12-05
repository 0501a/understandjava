package com.banyuan.jicheng.p7;

public class Customer extends Account {
    private String firstName;
    private String lastName;
    private String account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void display() {
        System.out.println("Customer [" + getLastName() + "," + getFirstName() + "] has a account: id is " + id + ", annualInterestRate is " + annualInterestRate * 100 + "%, balance is " + balance);
    }

}
