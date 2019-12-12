package com.banyuan.collectionDemo1;

public class Six {
    public static void main(String[] args) {

        StringBuilder a =new StringBuilder("qwertyui");

        StringBuilder b = new StringBuilder(a.substring(1,3));
        a.replace(1,3,b.reverse().toString());

        System.out.println(a);
    }
}
