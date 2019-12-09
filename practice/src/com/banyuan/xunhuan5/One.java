package com.banyuan.xunhuan5;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int countOddNumber = 0;
        int countEvenNumber = 0;
        do{
            int number = s.nextInt();
            if((number <= 0 || number>=100000) && number!= -1){
                System.out.println("超出范围");
            }else if(number != -1){
                if(number%2 == 0){
                    countEvenNumber++;
                }else {
                    countOddNumber++;
                }
            }else {
                break;
            }
        }while (true);

        System.out.println(countOddNumber + " " + countEvenNumber);
    }
}
