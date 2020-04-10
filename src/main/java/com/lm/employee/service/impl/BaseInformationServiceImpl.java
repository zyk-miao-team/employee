package com.lm.employee.service.impl;

import com.lm.employee.entity.Employee;
import com.lm.employee.mapper.EmployeeMapper;
import com.lm.employee.service.BaseInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseInformationServiceImpl implements BaseInformationService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee selectUserInfo(String emplId) {
        Employee employee = employeeMapper.selectOneEmloyee(emplId);
        return employee;
    }

    @Override
    public String updatePassword(String emplId, String oldPwd, String newPwd) {
        try {
            employeeMapper.updatePassword(emplId, oldPwd, newPwd);
            return "密码修改成功";
        } catch (Exception e) {
            return "密码修改失败，请重试！";
        }
    }

    @Override
    public List<Employee> selectAllEmloyee() {
        List<Employee> employeeList = employeeMapper.selectAllEmloyee();
        return employeeList;
    }

    @Override
    public String deletEmployee(String emplId) {
        try {
            employeeMapper.deletEmployee(emplId);
            return "deleteSuccess";
        } catch (Exception e) {
            return "deleteFaild";
        }
    }

    @Override
    public String updateEmployee(Employee employee) {
        try {
            employeeMapper.updateEmployee(employee);
            return "updateSuccess";
        } catch (Exception e) {
            return "updateFaild";
        }
    }
}
