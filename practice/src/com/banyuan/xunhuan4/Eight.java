package com.banyuan.xunhuan4;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 1 ; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("max " + max + ",maxIndex " +maxIndex);
        System.out.println("min " + min + ",minIndex " +minIndex);
    }
}
