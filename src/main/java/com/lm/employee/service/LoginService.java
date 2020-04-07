package com.lm.employee.service;


import com.lm.employee.entity.Employee;
import com.lm.employee.entity.Test;

import java.util.List;

public interface LoginService {
    /**
     *登录
     */
    String login(String emplId, String password);

    List<Test> log(String emplId);
}
