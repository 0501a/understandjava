package com.banyuan.jinchu3;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("请输入整数");

        Scanner s = new Scanner(System.in);
        Integer decimal = s.nextInt();

        System.out.println(Integer.toBinaryString(decimal));


    }
}
