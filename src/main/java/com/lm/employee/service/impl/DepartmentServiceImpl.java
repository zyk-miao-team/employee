package com.lm.employee.service.impl;

import com.lm.employee.entity.Department;
import com.lm.employee.mapper.DepartmentMapper;
import com.lm.employee.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectDepartment() {
        List<Department> departmentList=departmentMapper.selectDepartment();
        return departmentList;
    }

    @Override
    public String deletDepartment(String deptNo) {
        try {
            departmentMapper.deletDepartment(deptNo);
            return "deleteSuccess";
        } catch (Exception e) {
            return "deleteFaild";
        }
    }

    @Override
    public String updateDepartment(Department department) {
        try {
            departmentMapper.updateDepartment(department);
            return "updateSuccess";
        } catch (Exception e) {
            return "updateFaild";
        }
    }

    @Override
    public String addDepartment(Department department) {
        try {
            departmentMapper.addDepartment(department);
            return "addSuccess";
        } catch (Exception e) {
            return "addFaild";
        }
    }
}
