package com.example.springboot_study_01.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/*
 *   时间：2022/5/23
 *
 *
 */
@Data
public class Menu {
    private String name;
    private String path;
    private List<Menu> children = new ArrayList<>();


    public Menu(String name,String path){
        this.name = name;
        this.path = path;
    }

    public void addChildren(Menu menu){
        children.add(menu);
    }
}
