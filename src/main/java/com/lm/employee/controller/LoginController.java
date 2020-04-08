package com.lm.employee.controller;

import com.lm.employee.entity.Auth;
import com.lm.employee.entity.MenuList;
import com.lm.employee.service.GetAuthorityService;
import com.lm.employee.service.LoginService;
import com.lm.employee.tools.MyTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private GetAuthorityService getAuthorityService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody boolean login(HttpServletRequest request) {
        String emplId = request.getParameter("username");
        String password = request.getParameter("password");
        String result = loginService.login(emplId, password);
        if (!result.equals("failed")) {
            HttpSession session = request.getSession();   //获取session并将emplId存入session对象
            session.setAttribute("emplid", emplId);
            session.setAttribute("name",result);
            return true;
        }
        return false;
    }

    @RequestMapping(value = "/auth", method = RequestMethod.GET)
    public @ResponseBody List<MenuList> getAuthority(HttpServletRequest request){
        String emplId=request.getParameter("username");
        List<Auth> auths=getAuthorityService.selectByEmplId(emplId);
        List<MenuList> lists=new ArrayList<>();
        MenuList menuList;
        for (int i = 0,l=auths.size(); i <l ; i++) {
         menuList= MyTools.Auth2MenuList(auths.get(i));
            lists.add(menuList);

        }
        return lists;
    }

}


