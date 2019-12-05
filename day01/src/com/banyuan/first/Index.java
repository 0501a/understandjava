package com.banyuan.first;

public class Index {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int j = 0;
        for (int i = 0; i < 5; i++) {
            for (j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    arr[i][0] = 1;
                    arr[i][i] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

