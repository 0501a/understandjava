package com.banyuan.collectionDemo1.collection02;

import java.util.Date;

public class Two {
    public static void main(String[] args) {

        Date date = new Date(1998 - 1900,7 - 1,8,2,00,00);
        Date date1 = new Date();

        System.out.println(date);
        long a = date1.getTime() - date.getTime();

        System.out.println(a/1000/3600/24/365);
    }

}
