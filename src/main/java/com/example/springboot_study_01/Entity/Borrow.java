package com.example.springboot_study_01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/*
 *   时间：2021/5/17
 *
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {
    private int borrowid;
    private int bookid;
    private int userid;
    private Date borrowtime;

}
