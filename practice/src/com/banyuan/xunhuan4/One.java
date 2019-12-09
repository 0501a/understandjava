package com.banyuan.xunhuan4;

import java.util.Scanner;

/**
 * 1.任意输入 n行 n列的乘法口诀表
 */

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入几行几列的乘法表");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
