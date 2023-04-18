package com.example.springboot_study_01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.PrinterURI;

/*
 *   时间：2022/5/2
 *
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    private String phone;
    private String password;
}
