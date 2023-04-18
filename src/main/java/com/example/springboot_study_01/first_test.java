package com.example.springboot_study_01;

import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
/*
 *   时间：2021/5/14
 *
 *
 */
@RestController
@RequestMapping(value = "/hello")
public class first_test {
    @RequestMapping("/haha")
    public String hello(){
        return "hello springboot!";
    }
}
