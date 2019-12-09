package com.banyuan.one;

public class Company {
    Employee [] employees = new Employee[20];
    String name ;
    double salary;

    public String getName(){
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void add(String name,double salary){
        this.name=name;

    }

}
