package com.banyuan.first;

import java.util.Scanner;

public class Five {
    public static <integer> void main(String[] args){
        int [] arr1={12,12,12,23,67,67,89,89,90,98};
        int [] arr2={0,0,0,0,0,0,0,0,0,0};

        int k=0;
        for(int i=0;i<10;i++){
            if(arr1[k]==arr1[i])
                arr2[k]++;
            else
                k=i++;
        }
        for(int i=0;i<10;i++){
            arr2[i]++;
            if(arr2[i]!=0)
                System.out.println(arr1[i]+","+arr2[i]);
        }


    }
}
