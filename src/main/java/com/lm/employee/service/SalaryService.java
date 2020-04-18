package com.lm.employee.service;

import com.lm.employee.entity.Salary;

import java.util.List;

public interface SalaryService {
    /**
     * 查询个人薪资信息
     */
    List<Salary> selectOneSalary(String emplId);

    /**
     * 查询所有薪资信息
     */
    List<Salary> selectSalary();

    /**
     *管理员删除某条薪资信息
     */
    String deletSalary(String id);

    /**
     * 管理员修改某条薪资信息
     */
    String updateSalary(Salary salary);

    /**
     * 添加工资记录
     */
    String addSalary(Salary salary);
}
