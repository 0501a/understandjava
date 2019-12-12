package com.banyuan.jihe02.two;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> stu=new TreeSet<>();
        for(int i=0;i<40;i++){
            int a= (int) (50 + Math.random() * 51);
            stu.add(new Student("同学"+(i+1),180201+i,a));
        }
        for(Student s:stu){
            System.out.println(s);
        }
    }
}
