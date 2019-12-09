package com.banyuan.jinchu3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {

        Random r = new Random();

        int[] arrNum = new int[10];

        for (int i = 0; i < 10; i++) {
            arrNum[i] = r.nextInt(30);
        }

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if(num == arrNum[i]){
                count++;
            }
        }

        System.out.println(Arrays.toString(arrNum));


        System.out.println(count);
    }
}
