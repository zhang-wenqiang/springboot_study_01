package com.example.springboot_study_01.Controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot_study_01.Service.UserService;
import com.example.springboot_study_01.Entity.User;
import com.example.springboot_study_01.Service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/*
 *   时间：2021/5/15
 *
 *
 */
@Controller
@RequestMapping(value="/user",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserService2 userService2;
    @GetMapping( "/login")
    public String login(){
        return "login";
    }
    @GetMapping("/registry")
    public String registry(){
        return "registry";
    }

    @PostMapping("/check")
    public String test(String useraccount, String userpassword , HttpSession session){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("Useraccount",useraccount);
        wrapper.eq("Userpassword",userpassword);
        User user = userService2.getOne(wrapper);
        if(user != null){
            session.setAttribute("User",user);
            return "redirect:/book/selectall";
        }
        else {
            return "login";
        }

    }


    @PostMapping("/addone")
    @ResponseBody
    public String enroll(String username,int userage,String usersex,String userphone,String useraccount,String userpassword){
        User user = new User(username,userage,usersex,userphone,useraccount,userpassword);
        System.out.println(user);
        int check = userService.insertUser(user);
        if(check>0)
            return "创建成功";
        else
            return "创建失败";
    }
//r
    @RequestMapping("/listone")
    @ResponseBody
    public User listOne(String name){
        QueryWrapper wrapper = new QueryWrapper();

        return userService.findUser(name);
    }
    @PostMapping("/listone2")
    @ResponseBody
    public String listOne(String useraccount,String userpassword){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("account",useraccount);
        wrapper.eq("password",userpassword);
        User user = userService.findUser2(wrapper);
        if(user!=null)
            return "registry";
        return "";
    }

    @RequestMapping("/listall")
    @ResponseBody
    public List<User> listAll(){
        return userService.listUser();
    }
    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(User user){
        int result = userService.insertUser(user);
        if(result>=1){
            return "添加成功";
        }
        else {
            return "添加失败";
        }
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String update(User user){
        int result = userService.updateUser(user);
        if(result>=1){
            return "修改成功";
        }
        else{
            return "修改失败";
        }
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public String delete(int id){
        int result = userService.deleteUser(id);
        if(result>=1){
            return "删除成功";
        }
        else{
            return "修改失败";
        }
    }
}
