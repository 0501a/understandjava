package com.banyuan;

public class Test extends Son {
    Son ab=new Son();

    public Test(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test test=new Test();
    }

}
