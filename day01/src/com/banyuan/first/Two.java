package com.banyuan.first;

public class Two {
    public static void main(String[] args) {
        int x=4;
        int y=(x++)+(++x)+(x*10);
        System.out.println("x="+x+",y="+y);
    }
}
