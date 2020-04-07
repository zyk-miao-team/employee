package com.lm.employee.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MenuList{
    String title;
    String icon="icon-text";
    String href;
    String spread="false";
    public List<MenuList> children=new ArrayList<>();

    public MenuList(String title, String href){
        this.title=title;
        this.href=href;
    }

}
