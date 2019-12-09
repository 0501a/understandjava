package com.banyuan.xunhuan4;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] a=new int[3][10];
        int [] avg=new int[3];
        int [] num=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("请输入第"+(i+1)+"个班的学生的成绩:");
            for(int j=0;j<10;j++){
                System.out.print("请输入第"+(j+1)+"个学生的成绩:");
                a[i][j]=sc.nextInt();
                num[i]+=a[i][j];
            }
            System.out.println();
            avg[i]=num[i]/10;
        }
        for(int i=0;i<3;i++){
            System.out.println("第"+(i+1)+"个班总成绩为:"+(num[i])+",平均分为:"+avg[i]);
        }
    }
}
