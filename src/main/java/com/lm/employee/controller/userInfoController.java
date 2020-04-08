package com.lm.employee.controller;

import com.lm.employee.entity.Employee;
import com.lm.employee.service.BaseInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
@Controller
public class userInfoController {
    @Autowired
    private BaseInformationService baseInformationService;

    @RequestMapping(value = "/selectOneEmployee",method = RequestMethod.POST)
    public @ResponseBody Employee selectOneEmployee(HttpServletRequest request) {
        String emplId = request.getParameter("emplId");
        Employee employee = baseInformationService.selectUserInfo(emplId);
        return employee;
    }

    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    public @ResponseBody String updatePassword(HttpServletRequest request) {
        String emplId = request.getParameter("username");
        String oldPwd=request.getParameter("oldPassword");
        String newPwd=request.getParameter("newPassword");
        String result = baseInformationService.updatePassword(emplId,oldPwd,newPwd);
        return result;
    }
}
