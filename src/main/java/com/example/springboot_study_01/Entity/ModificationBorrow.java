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
public class ModificationBorrow {
    private int borrowid;
    private String bookname;
    private String username;
    private Date borrowtime;

}
