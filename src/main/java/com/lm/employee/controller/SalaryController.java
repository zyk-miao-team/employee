package com.lm.employee.controller;

import com.lm.employee.entity.Employee;
import com.lm.employee.entity.Salary;
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
}
