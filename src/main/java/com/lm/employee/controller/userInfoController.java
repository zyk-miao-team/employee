package com.lm.employee.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import com.lm.employee.entity.EmplManage;
import com.lm.employee.entity.Employee;
import com.lm.employee.service.BaseInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
        System.out.println("aaa");
        String emplId = request.getParameter("emplid");
        String oldPwd=request.getParameter("oldPassword");
        String newPwd=request.getParameter("newPassword");
        String result = baseInformationService.updatePassword(emplId,oldPwd,newPwd);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/selectAllEmloyee",method = RequestMethod.GET)
    public @ResponseBody EmplManage selectAllEmloyee() {
        List<Employee> employeeList = baseInformationService.selectAllEmloyee();
        EmplManage emplManage=new EmplManage();
        emplManage.setMsg("success");
        emplManage.setCode("0");
        emplManage.setData(employeeList);
        return emplManage;
    }

    @RequestMapping(value = "/deletEmployee",method = RequestMethod.POST)
    public @ResponseBody String deletEmployee(HttpServletRequest request){
        String emplId=request.getParameter("emplid");
        String result=baseInformationService.deletEmployee(emplId);
        return result;
    }

    @RequestMapping(value = "/updateEmployee",method = RequestMethod.POST)
    public @ResponseBody String updateEmployee(Employee employee){
        String result=baseInformationService.updateEmployee(employee);
        return result;
    }

    @RequestMapping(value = "/addNewEmployee",method = RequestMethod.POST)
    public @ResponseBody String addNewEmployee(Employee employee) {
        String result=baseInformationService.addNewEmployee(employee);
        return result;
    }
}
