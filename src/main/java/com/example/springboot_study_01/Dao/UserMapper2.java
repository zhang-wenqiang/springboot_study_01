package com.example.springboot_study_01.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_study_01.Entity.User;
import org.apache.ibatis.annotations.Mapper;


/*
 *   时间：2021/5/17
 *
 *
 */
@Mapper
public interface UserMapper2 extends BaseMapper<User> {
}
