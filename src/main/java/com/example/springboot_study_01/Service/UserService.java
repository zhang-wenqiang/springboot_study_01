package com.example.springboot_study_01.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot_study_01.Dao.UserMapper;

import com.example.springboot_study_01.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *   时间：2021/5/15
 *
 *
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUser(String name){

        return userMapper.find(name);
    }
    public User findUser2(QueryWrapper wrapper){

        return userMapper.find2(wrapper);
    }
    public List<User> listUser(){
        return userMapper.list();
    }
    public int insertUser(User user){
        return userMapper.insert(user);
    }
    public int deleteUser(int id){
        return userMapper.delete(id);
    }
    public int updateUser(User user){
        return userMapper.update(user);
    }
}
