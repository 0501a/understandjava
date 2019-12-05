package com.banyuan.Practice1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        int num=0;
        for(int i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");
            x=sc.nextInt();
            num+=x;
        }
        System.out.println("总成绩为:"+num);
    }
}
