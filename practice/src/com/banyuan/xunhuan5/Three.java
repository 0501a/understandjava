package com.banyuan.xunhuan5;

public class Three {
    public static void main(String[] args) {
        int[] arr = {226644,773388,254565,116699};
        int sumSaleVolume = 0;
        int i = 0;
        for(int a : arr){
            sumSaleVolume = sumSaleVolume + arr[i];
            i++;
        }

        System.out.println(sumSaleVolume);
    }
}
