package com.example.springboot_study_01.Service;

import com.example.springboot_study_01.Dao.BookMapper;
import com.example.springboot_study_01.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *   时间：2021/5/17
 *
 *
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public Book findBook(int bookid){
        return bookMapper.find(bookid);
    }
    public List<Book> listBook(){
        return bookMapper.list();
    }
    public int insertBook(Book book){
        return bookMapper.insert(book);
    }
    public int deleteBook(int bookid){
        return bookMapper.delete(bookid);
    }

    public int updatebook(Book book){ return bookMapper.updatebook(book);}
}
