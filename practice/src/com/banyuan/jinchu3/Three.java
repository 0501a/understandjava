package com.banyuan.jinchu3;

import java.util.Arrays;
import java.util.Collections;

public class Three {

    public static void main(String[] args) {
        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};

        int min = (int) Collections.min(Arrays.asList(arr));
        int max = (int) Collections.max(Arrays.asList(arr));

        System.out.println("最大值是:" + max + ",最小值是: " + min);

        }
}
