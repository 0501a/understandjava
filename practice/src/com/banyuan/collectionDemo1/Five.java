package com.banyuan.collectionDemo1;

public class Five {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer();
        a.append("asdfghjkl");

        System.out.println(a.reverse());
        a.replace(0,5,"");
        System.out.println(a);
    }
}
