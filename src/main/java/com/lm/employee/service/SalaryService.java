package com.lm.employee.service;

import com.lm.employee.entity.Salary;

import java.util.List;

public interface SalaryService {
    /**
     * 查询个人薪资信息
     */
    List<Salary> selectOneSalary(String emplId);
}
