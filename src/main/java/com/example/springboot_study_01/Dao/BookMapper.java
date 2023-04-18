package com.example.springboot_study_01.Dao;

import com.example.springboot_study_01.Entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *   时间：2021/5/17
 *
 *
 */
@Repository
@Mapper
public interface BookMapper {

    Book find(int bookid);
    List<Book> list();
    int insert(Book book);
    int updatebook(Book book);
    int delete(int bookid);


}
