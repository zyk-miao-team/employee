package com.lm.employee.tools;

import com.lm.employee.entity.Auth;
import com.lm.employee.entity.MenuList;

public class MyTools {
    public static MenuList Auth2MenuList(Auth auth){
        MenuList menuList= new MenuList(auth.getAuthName(),auth.getPath());
        if(auth.getChildren()!=null){
            for (int i = 0,l=auth.getChildren().size(); i <l ; i++) {
                menuList.children.add(Auth2MenuList(auth.getChildren().get(i)));
            }
        }
        return menuList;
    }
}
