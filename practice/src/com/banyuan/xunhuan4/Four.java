package com.banyuan.xunhuan4;

import java.util.Scanner;

public class Four {

    /*定义一个数组,数组成P员10个,找出数组中最大数连同下标一起输出*/

        public static void main(String[] args) {
            int[] arr = new int[10];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();
            F1:for (int i = 0; i < arr.length; i++) {
                int count = 0;

                for (int j = 0; j < arr.length; j++) {
                    if(arr[i] < arr[j]){
                        continue F1;
                    }else {
                        count++;
                    }
                }

                if(count == arr.length){
                    System.out.println(arr[i] + "  " + i);
                }
            }
        }

}
