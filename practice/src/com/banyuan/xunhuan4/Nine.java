package com.banyuan.xunhuan4;

import java.util.Arrays;
import java.util.Random;

public class Nine {
    public static void main(String[] args) {
        int[] arr = new int[30];

        for(int i = 0; i<arr.length ; i++){
            arr[i] = new Random().nextInt(10);
        }

        int singleDigit[] = {0,1,2,3,4,5,6,7,8,9};
        int count[] = new int[10];

        for(int i = 0 ; i<10 ; i++){
            for (int j = 0; j < 30; j++) {
                if(singleDigit[i] == arr[j]){
                    count[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(singleDigit));
        System.out.println(Arrays.toString(count));
    }
}
