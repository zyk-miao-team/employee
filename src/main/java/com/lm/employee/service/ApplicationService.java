package com.lm.employee.service;

import com.lm.employee.entity.Application;
import com.lm.employee.entity.Department;

import java.util.List;

public interface ApplicationService {
    /**
     * 查询所有应聘信息
     */
    List<Application> selectApplication();

    /**
     *管理员删除某个应聘信息
     */
    String deletApplication(String id);

    /**
     * 管理员修改某个应聘信息
     */
    String updateApplication(Application application);

    /**
     * 添加应聘人员信息
     */
    String addApplication(Application application);
}
