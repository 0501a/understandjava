package com.banyuan.jihe02.one;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("anna", "001");
        s1.course.add(new Course("001", "c"));
        s1.course.add(new Course("003", "java"));
        s1.course.add(new Course("002", "english"));

        Student s2 = new Student("lisa", "002");
        s2.course.add(new Course("001", "c"));
        s2.course.add(new Course("004", "math"));
        s2.course.remove(new Course("004","math"));
//        s2.course.clear();
        System.out.println(s1.revise(new Course("001","c"),new Course("004","math")));

        System.out.println(s2.course.contains(new Course("001", "c")));
        System.out.println(s2);
        System.out.println(s1);
    }
}
