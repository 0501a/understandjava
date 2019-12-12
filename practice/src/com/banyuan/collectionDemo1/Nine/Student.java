package com.banyuan.collectionDemo1.Nine;

public class Student {
    static int a=100;
    int stuNum;
    String name;

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.stuNum = a++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", name='" + name + '\'' +
                '}';
    }
}
