package com.lm.employee.service;

import com.lm.employee.entity.Employee;

import java.util.List;

public interface BaseInformationService {
    /**
     * 查询员工个人信息
     */
    Employee selectUserInfo(String emplId);

    /**
     * 修改密码
     */
    String updatePassword(String emplId,String oldPwd,String newPwd);

    /**
     * 查询所有员工基本信息
     */
    List<Employee> selectAllEmloyee();

    /**
     * 管理员删除某个员工
     */
    String deletEmployee(String emplId);

    /**
     * 管理员修改某个员工的资料
     */
    String updateEmployee(Employee employee);

}
