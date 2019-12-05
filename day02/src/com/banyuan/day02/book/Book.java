package com.banyuan.day02.book;

public class Book {
    String title;
    int pageNum = 200;

    //赋值
    public void setPageNum(int pageNum) {
        if (pageNum >= 200)
            this.pageNum = pageNum;
        else {
            System.out.println("输入错误");
            this.pageNum = 200;
        }
    }
    public void setTitle(String title){
        this.title=title;
    }

    //取值
    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    //detail方法
    public static void detail(String title, int pageNum){
        System.out.println("名称:"+title+",页数:"+pageNum);
    }



}
