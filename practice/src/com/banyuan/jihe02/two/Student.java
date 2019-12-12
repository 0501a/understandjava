package com.banyuan.jihe02.two;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    int score;
    int stuNum;

    public Student(String name, int stuNum, int score) {
        this.name = name;
        this.score = score;
        this.stuNum = stuNum;
    }

    public int getScore() {
        return score;
    }

    public int getStuNum() {
        return stuNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", stuNum=" + stuNum +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int num = this.getScore() - o.getScore();
        int num1 = num == 0 ? this.getStuNum() - o.getStuNum() : num;
        return num1;
    }
}
