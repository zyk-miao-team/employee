package com.lm.employee.service.impl;

import com.lm.employee.entity.Test;
import com.lm.employee.mapper.EmployeeMapper;
import com.lm.employee.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public String login(String emplId,String password) {
        String pwd=employeeMapper.selectPassword(emplId);
        System.out.println(pwd);
        System.out.println(password);
        if (password.equals(pwd)) {
            String name=employeeMapper.selectName(emplId);
            return name;
        }
        return "failed";
    }
}
