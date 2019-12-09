package com.banyuan.xunhuan5;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个四位数:");
        int a=sc.nextInt();
        int []arr=new int[4];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=a%10;
            a=a/10;
            arr[i]=(arr[i]+9)%10;
        }
        for(int i=0;i<2;i++){
            int x=0;
            x=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=x;
        }
        System.out.println("加密后的新密码为:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
