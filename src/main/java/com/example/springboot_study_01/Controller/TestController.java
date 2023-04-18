package com.example.springboot_study_01.Controller;

import com.alibaba.fastjson.JSON;
import com.example.springboot_study_01.Entity.Menu;
import com.example.springboot_study_01.Entity.Test;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 *   时间：2022/5/2
 *
 *
 */
@Controller
@RequestMapping("/vueStudy")
public class TestController {

    @PostMapping("/login")
    @ResponseBody
    @CrossOrigin
    public String loginCheck(String account,String pass){
        Map<String,String> map = new HashMap();
        if (account.equals("admin")&&pass.equals("123")){

            map.put("result","1");
        }else {
            map.put("result","0");
        }
        String result = JSON.toJSONString(map);

        return result;
    }


    @GetMapping("/getmenulist")
    @ResponseBody
    @CrossOrigin
    public String getMenuList(){
        //总菜单列表
        ArrayList<Menu> menus = new ArrayList<>();
        //无子级首页
        Menu index = new Menu("index","/index");
        menus.add(index);
        //数据统计页面，无子级
        Menu stats = new Menu("stats","/stats");
        menus.add(stats);
        //信息列表
        Menu msglist = new Menu("msglist", "/msglist");

        //信息列表下用户列表
        Menu userlist = new Menu("userlist", "/msglist/userlist");
        msglist.addChildren(userlist);
        //再给信息列表添加一个
        Menu goodslist = new Menu("goodslist","/msglist/goodslist");
        msglist.addChildren(goodslist);

        menus.add(msglist);
        String string = JSON.toJSONString(menus);
        return string;


    }


}
