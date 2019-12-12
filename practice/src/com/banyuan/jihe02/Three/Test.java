package com.banyuan.jihe02.Three;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> s=new TreeSet<>();
        s.add("apple");
        s.add("grape");
        s.add("banana");
        s.add("pear");

        System.out.println(s);
        System.out.println("max="+s.last());
        System.out.println("min="+s.first());
    }


}
