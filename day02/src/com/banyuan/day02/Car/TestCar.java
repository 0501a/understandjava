package com.banyuan.day02.Car;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args){
        Car c1=new Car();
        Car c2=new Car();
        Car c3=new Car();
        Car c4=new Car();
        Car c5=new Car();
        c1.name="奔驰";
        c1.type="大奔s300";
        c1.color="黑色";
        c1.pd="2019-10-20";
        c1.country="made in china";

        c2.name="奔驰";
        c2.type="大奔s400";
        c2.color="红色";
        c2.pd="2018-11-20";
        c2.country="made in china";

        c3.name="奥迪";
        c3.type="奥迪g300";
        c3.color="黑色";
        c3.pd="2019-9-20";
        c3.country="made in china";

        c4.name="宝马";
        c4.type="宝马d7";
        c4.color="白色";
        c4.pd="2017-10-08";
        c4.country="made in china";

        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();

    }
}
