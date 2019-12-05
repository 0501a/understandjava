package com.banyuan.day02.book;

public class TestBook {
    public static void main(String[] args){
        Book book=new Book();
        book.title="语文";
        book.pageNum=300;
        Book.detail(book.title,book.pageNum);
    }
}
