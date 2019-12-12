package com.banyuan;

public class Practice {
    public static void main(String[] args) {
        byte[] by = {65, 67, 68, 97, 98, 101};
        System.out.println(new String(by));
        System.out.println(new String(by, 0, 3));

        char[] va = {'a', 'b', 'c', 'd'};
        System.out.println(new String(va));
        System.out.println(new String(va, 0, 1));

        System.out.println("abcdW".compareToIgnoreCase("ABCDw"));

        System.out.println("我是你的谁,我是你的剑".contains("剑"));

        String str1 = "我是你的谁,我是你的剑";
        System.out.println(str1.startsWith("我") && str1.endsWith("剑"));

        String str = "";
        String str2 = null;
        System.out.println(str.isEmpty());
        //System.out.println(str2.isEmpty());


        System.out.println(str1.indexOf("你"));

        System.out.println(str1.lastIndexOf("你"));
        System.out.println(str1.indexOf("你", 4));

        System.out.println(str1.subSequence(1, 4));

        System.out.println(" 我是你的谁,我是你的剑 ".trim()+"1");

        System.out.println("我是你的谁,我是你的剑".replace("谁","被子"));

        System.out.println("我是你的谁,我是你的剑".replaceAll("你","哈"));

        char[] ab={'a','b','c','d'};
        System.out.println(String.valueOf(ab));


        String s=String.valueOf(ab);
        char[] ba=new char[4];
//        ba[]=s.toCharArray();
        System.out.println(s.toCharArray());
    }


}
