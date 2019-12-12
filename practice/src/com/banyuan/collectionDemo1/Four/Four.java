package com.banyuan.collectionDemo1.Four;

import java.util.Random;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int max = s.nextInt();
        int min = s.nextInt();

        for (int i = 0; i < 100; i++) {
            int a= (int) (min+Math.random()*(max-min+1));
            System.out.println(a);
        }
    }
}
