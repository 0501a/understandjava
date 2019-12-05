package com.banyuan.jicheng.P5;

public class Student extends Person {
    String school;
    String stuNumber;

    @Override
    public void work() {
        System.out.println("student的工作是学习");
    }
}
