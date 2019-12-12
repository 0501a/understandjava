package com.banyuan.collectionDemo1;

public class Seven {
    public static void main(String[] args) {
        String a = "To be or not to be";

        String[] arr = a.split(" ");


        StringBuilder[] b = new StringBuilder[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i]  =  new StringBuilder(arr[i]).reverse();
        }

        String b1 = String.join(" ",b);

        System.out.println(b1);
    }
}
