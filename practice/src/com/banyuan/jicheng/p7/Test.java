package com.banyuan.jicheng.p7;

public class Test {
    public static void main(String[] args) {
        Customer a=new Customer("Jane","Smith");
        a.setId("1000");
        a.setBalance(2000.00);
        a.setAnnualInterestRate(0.0123);
        a.deposit(100);
        a.withdraw(960);
        System.out.println(a.getBalance());
        a.withdraw(2000);
        a.display();
    }

}
