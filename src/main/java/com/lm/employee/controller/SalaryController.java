package com.lm.employee.controller;

import com.lm.employee.entity.*;
import com.lm.employee.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class SalaryController {
    @Autowired
    private SalaryService salaryService;

    @RequestMapping(value = "/selectOneSalary",method = RequestMethod.POST)
    public @ResponseBody List<Salary> selectOneEmployee(HttpServletRequest request) {
        String emplId = request.getParameter("emplId");
        List<Salary> salaryList=salaryService.selectOneSalary(emplId);
        return salaryList;
    }

    @RequestMapping(value = "/selectSalary",method = RequestMethod.GET)
    public @ResponseBody SalaryManage selectSalary(){
        List<Salary> salaryList=salaryService.selectSalary();
        SalaryManage salaryManage=new SalaryManage();
        salaryManage.setCode("0");
        salaryManage.setMsg("success");
        salaryManage.setData(salaryList);
        return salaryManage;
    }

    @RequestMapping(value = "/deletSalary",method = RequestMethod.POST)
    public @ResponseBody String deletSalary(String id){
        String result=salaryService.deletSalary(id);
        return result;
    }

    @RequestMapping(value = "/updateSalary",method = RequestMethod.POST)
    public @ResponseBody String updateSalary(Salary salary){
        String result=salaryService.updateSalary(salary);
        return result;
    }

    @RequestMapping(value = "/addSalary",method = RequestMethod.POST)
    public @ResponseBody String addSalary(Salary salary){
        String result=salaryService.addSalary(salary);
        return result;
    }
}
