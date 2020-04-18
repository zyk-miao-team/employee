package com.lm.employee.controller;

import com.lm.employee.entity.Department;
import com.lm.employee.entity.DepartmentManage;
import com.lm.employee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/selectDepartment",method = RequestMethod.GET)
    public @ResponseBody DepartmentManage selectDepartment(){
        List<Department> departmentList=departmentService.selectDepartment();
        DepartmentManage departmentManage=new DepartmentManage();
        departmentManage.setMsg("success");
        departmentManage.setCode("0");
        departmentManage.setData(departmentList);
        return departmentManage;
    }

    @RequestMapping(value = "/deletDepartment",method = RequestMethod.POST)
    public @ResponseBody String deletEmployee(String deptNo){
        String result=departmentService.deletDepartment(deptNo);
        return result;
    }

    @RequestMapping(value = "/updateDepartment",method = RequestMethod.POST)
    public @ResponseBody String updateDepartment(Department department){
        String result=departmentService.updateDepartment(department);
        return result;
    }

    @RequestMapping(value = "/addDepartment",method = RequestMethod.POST)
    public @ResponseBody String addDepartment(Department department){
        String result=departmentService.addDepartment(department);
        return result;
    }

}
