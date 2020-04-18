package com.lm.employee.service;

import com.lm.employee.entity.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * 查询所有部门信息
     */
    List<Department> selectDepartment();

    /**
     *管理员删除某个部门
     */
    String deletDepartment(String deptNo);

    /**
     * 管理员修改某个部门的资料
     */
    String updateDepartment(Department department);

    /**
     * 管理员添加部门
     */
    String addDepartment(Department department);
}
