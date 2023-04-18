package com.example.springboot_study_01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *   时间：2021/5/17
 *
 *
 */
@Data
@NoArgsConstructor
public class Book {
    private int bookid;
    private String bookname;
    private String bookauthor;
    private String bookconcern;
    private String bookprice;
    private String bookamount;

    public Book(int bookid, String bookname, String bookauthor, String bookconcern, String bookprice, String bookamount) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
        this.bookconcern = bookconcern;
        this.bookprice = bookprice;
        this.bookamount = bookamount;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookconcern() {
        return bookconcern;
    }

    public void setBookconcern(String bookconcern) {
        this.bookconcern = bookconcern;
    }

    public String getBookprice() {
        return bookprice;
    }

    public void setBookprice(String bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookamount() {
        return bookamount;
    }

    public void setBookamount(String bookamount) {
        this.bookamount = bookamount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                ", bookconcern='" + bookconcern + '\'' +
                ", bookprice='" + bookprice + '\'' +
                ", bookamount='" + bookamount + '\'' +
                '}';
    }

    public Book toown(){
        return new Book(this.bookid,this.bookname,this.bookauthor,this.bookconcern,this.bookprice,this.bookamount);
    }
}
