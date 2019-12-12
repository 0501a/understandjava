package com.banyuan.jihe02.Four;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        do{
            int a= (int) (1+Math.random()*20);
            set.add(a);
        }
        while(set.size()!=10);
        for(int str:set) {
            System.out.println(str);
        }
    }

}
