package com.example.springboot_study_01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

/*
 *   时间：2021/5/15
 *
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int Userid;
    private String Username;
    private int Userage;
    private String Usersex;
    private String Userphone;
    private String Useraccount;
    private String Userpassword;

    public User(String username, int userage, String usersex, String userphone, String useraccount, String userpassword) {
        Random random = new Random();
        Userid = random.nextInt();
        Username = username;
        Userage = userage;
        Usersex = usersex;
        Userphone = userphone;
        Useraccount = useraccount;
        Userpassword = userpassword;
    }
}
