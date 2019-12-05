package com.banyuan.jicheng.P5;

public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.work();
        stu.eat();
        stu.sleep();
        Worker wor=new Worker();
        wor.work();
        wor.eat();
        wor.sleep();
        StudentLeader stuL=new StudentLeader();
        stuL.meeting();
        stuL.eat();
        stuL.sleep();
        stu.work();

    }
}
