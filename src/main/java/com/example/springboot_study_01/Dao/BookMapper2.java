package com.example.springboot_study_01.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_study_01.Entity.Book;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.util.ArrayList;
import java.util.List;


/*
 *   时间：2021/5/17
 *
 *
 */
@Mapper
public interface BookMapper2 extends BaseMapper<Book> {
    List<Book> listAllBook();
    int updatebook(Book book);
}