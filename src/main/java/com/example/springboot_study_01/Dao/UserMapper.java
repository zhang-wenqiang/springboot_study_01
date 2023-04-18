package com.example.springboot_study_01.Dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_study_01.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
 *   时间：2021/5/15
 *
 *
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User find(String name);
    User find2(QueryWrapper wrapper);
    List<User> list();
    int insert(User user);
    int delete(int id);
    int update(User user);

}
