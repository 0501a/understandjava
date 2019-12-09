package com.banyuan.xunhuan4;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a=new int[10];
        int []b=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("请输入第"+(i+1)+"个数:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }

    }
}
