package com.banyuan.Practice1;

import java.util.Scanner;

public class Two {
    static String toLower(String ab){
        char [] a=ab.toCharArray();
        for (int i=0;i<a.length;i++){
            a[i]=(char)(a[i]+'a'-'A');
        }
        return String.valueOf(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大写字符串:");
        String abc=sc.next();
        abc=toLower(abc);
        System.out.println(abc);

    }
}
