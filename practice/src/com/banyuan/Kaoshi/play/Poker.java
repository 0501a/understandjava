package com.banyuan.Kaoshi.play;

public class Poker {
    public static void main(String[] args) {
        String [] p = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
                "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
                "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
                "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
                "大", "小"};
        String[][] arr = new String[3][20];
        //随机函数
        for (int j = 0; j < 2; j++) {
            System.out.print("农民:");
            for (int i = 0; i < 17; i++) {
                int x;
                //随机出0～16-i中的一个数x
                do {
                    x = (int) (0 + Math.random() * (53 + 1));
                }
                while(p[x].equals("111"));
                arr[j][i]=p[x];
                p[x]="111";
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        System.out.print("地主:");
        for (int i = 0; i < 20; i++) {
            int x;
            //随机出0～54-i中的一个数x
            do {
                x = (int) (0 + Math.random() * (53 + 1));
            }
            while(p[x].equals("111"));
            arr[2][i]=p[x];
            p[x]="111";
            System.out.print(arr[2][i]+" ");
        }

    }
}
