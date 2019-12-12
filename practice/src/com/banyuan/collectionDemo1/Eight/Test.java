package com.banyuan.collectionDemo1.Eight;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        String str = sc.next();
        int a=sc.nextInt();

        System.out.println(Arrays.toString(str.split(str, a)));
    }
}
