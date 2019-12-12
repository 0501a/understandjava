package com.banyuan.jihe02.one;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    String name;
    String stuNum;
    Set <Course> course=new HashSet<>();

    public Student(String name,String stuNum){
        this.name=name;
        this.stuNum=stuNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名:'" + name + '\'' +
                ", 学号:'" + stuNum + '\'' +
                ", 所选课程:" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(stuNum, student.stuNum) &&
                Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stuNum, course);
    }

    public boolean revise(Course o1,Course o2){
        if(!course.remove(o1))
            return false;
        course.add(o2);
        return true;
    }
}
