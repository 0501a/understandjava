package com.banyuan.xunhuan4;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int[] score = new int[8];
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 100;
        for (int i = 0 ; i<8 ; i++){
            score[i] = s.nextInt();
            sum = sum + score[i];
            if(max < score[i]){
                max = score[i];
            }
            if(min > score[i]){
                min = score[i];
            }
        }

        System.out.println("sum:" + sum + "  max:"  + max  + "  min:" + min);
    }

}
