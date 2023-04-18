package com.example.springboot_study_01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringbootStudy01ApplicationTests {

    @Test
    void contextLoads() {


        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pwd = encoder.encode("123456");


        System.out.println(pwd);
    }

}
