package com.lm.employee.service;

import com.lm.employee.entity.Employee;

public interface BaseInformationService {
    /**
     * 查询员工个人信息
     */
    Employee selectUserInfo(String emplId);

    /**
     * 修改密码
     */
    String updatePassword(String emplId,String oldPwd,String newPwd);
}
