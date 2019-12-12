package com.banyuan.jihe02.Three;

import java.util.TreeSet;

public class Index implements Comparable<String>{
    String ind;

    @Override
    public int compareTo(String o) {
        return this.ind.length()-o.length();
    }



}
