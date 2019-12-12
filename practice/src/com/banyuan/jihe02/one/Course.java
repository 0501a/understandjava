package com.banyuan.jihe02.one;

import java.util.Objects;

public class Course {
    String num;
    String courName;
    public Course(String num,String courName){
        this.num=num;
        this.courName=courName;
    }

    @Override
    public String toString() {
        return "{"+
                "编号:"+num+
                ",课程名:"+courName+
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(num, course.num) &&
                Objects.equals(courName, course.courName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, courName);
    }
}
