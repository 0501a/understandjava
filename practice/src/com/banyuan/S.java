package com.banyuan;

interface Inner{
    void show();
}
class Outer{
    public static Inner method(){
        return new Inner(){
            public void show(){ System.out.println("ss"); }
        };
    }
}

public class S {
    public static void main(String[] args) {
        Outer.method().show();
        //   inner.show();
    }
}
