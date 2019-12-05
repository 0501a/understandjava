package com.banyuan.jicheng.p8;

public abstract class Worker {
    String name;
    String IDcard;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getIDcard() {
        return IDcard;
    }

    public String getName() {
        return name;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void makeBonus();
}
