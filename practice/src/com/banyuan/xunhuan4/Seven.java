package com.banyuan.xunhuan4;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner s=  new Scanner(System.in);

        for (int i = 0 ; i< 10 ; i++){
            arr[i] = s.nextInt();
        }

        int number = s.nextInt();

        for (int i = 0 ; i<10 ; i++){
            if(number == arr[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println("查不到");
    }
}
