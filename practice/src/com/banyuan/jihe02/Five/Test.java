package com.banyuan.jihe02.Five;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> a= new ArrayList<>();
        a= Collections.singletonList(sc.nextLine());
        String []arr= new String[a.size()];
        a.toArray(arr);
        LinkedList<String>set=new LinkedList<String>();
        for(int i=0;i<a.size();i++){
            set.add(arr[i]);
        }
        String []temp=new String[set.size()];
        set.toArray(temp);
        for(int i=0;i<set.size();i++)
        System.out.println(temp[i]);
    }
}
