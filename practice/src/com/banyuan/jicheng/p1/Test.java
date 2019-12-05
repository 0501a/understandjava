package com.banyuan.jicheng.p1;

import com.banyuan.jicheng.p1.Square;

public class Test {
    public static void main(String[] args) {
        Square ab = new Square();
        int x = 2, y = 4, z = 8;
        System.out.println("面积是:"+ab.area(x,y));
        System.out.println("体积是:"+ab.volume(x,y,z));
    }
}
