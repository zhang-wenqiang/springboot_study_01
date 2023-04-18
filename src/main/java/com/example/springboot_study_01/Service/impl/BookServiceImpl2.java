package com.example.springboot_study_01.Service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_study_01.Dao.BookMapper2;
import com.example.springboot_study_01.Entity.Book;
import com.example.springboot_study_01.Service.BookService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *   时间：2021/5/18
 *
 *
 */
@Service
public class BookServiceImpl2 extends ServiceImpl<BookMapper2, Book> implements BookService2 {
    @Autowired
    private BookMapper2 bookMapper2;

    @Override
    public List<Book> list() {
        return bookMapper2.listAllBook();
    }

    public int updatebook(Book book){ return bookMapper2.updatebook(book);}
}
