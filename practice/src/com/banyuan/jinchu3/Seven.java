package com.banyuan.jinchu3;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer number = s.nextInt();

        int count1 = number.toString().length();


        int reversalNumber = 0;
        int count2 = 0;

        while(count1 > 0){

            reversalNumber += ((number%((int)(Math.pow(10,count1))) -number%((int)(Math.pow(10,count1-1))))/(int)Math.pow(10,count1 -1))  * (int)Math.pow(10,count2);


            count1--;
            count2++;
        }

        System.out.println(reversalNumber);

    }
}
