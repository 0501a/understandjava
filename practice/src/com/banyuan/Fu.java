package com.banyuan;

public class Fu {
    public static void main(String args[]) {
        Fu a = new Fu();
        a.method(8);
    }

    void method(int i) {
        System.out.println(" int:  "+i);
    }

    void method(long i) {
        System.out.println(" long:  "+i);
    }
}