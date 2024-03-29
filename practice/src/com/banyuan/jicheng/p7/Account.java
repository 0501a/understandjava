package com.banyuan.jicheng.p7;

/**
 * 写一个名为Account的类模拟账户。该类的属性和方法如下图所示。该类包括的属性:账号id,余额balance,年利率annualInterestRate;
 * 包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。
 * 提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。
 * B.创建Customer类。
 * a. 声明三个私有对象属性:firstName、lastName和account。
 * b. 声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l)
 * c. 声明两个公有存取器来访问该对象属性,方法getFirstName和getLastName返回相应的属性。
 * d. 声明setAccount 方法来对account属性赋值。
 * e. 声明getAccount 方法以获取account属性。
 */

public class Account {
    String id;
    double balance;
    double annualInterestRate;

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double x) {
        if(this.balance<x){
            System.out.println("余额不足,取款失败");
        }else {
            this.balance -= x;
            System.out.println("成功取出"+x);
        }
    }

    public void deposit(double x) {
        this.balance += x;
        System.out.println("成功存入"+x);
    }
}
