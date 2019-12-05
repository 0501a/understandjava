package com.banyuan.jicheng.P5;

public class Worker extends Person {
    String unit;
    int workAge;

    @Override
    public void work() {
        System.out.println("worker的工作是盖房子");
    }
}
