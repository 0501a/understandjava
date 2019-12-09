package com.banyuan.jinchu3;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("闰年");
        }
    }
}
