package com.lm.employee.mapper;

import com.lm.employee.entity.Department;
import com.lm.employee.entity.Employee;
import com.lm.employee.entity.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    /**
     * 查询所有部门信息
     */
    List<Department> selectDepartment();

    /**
     *管理员删除某个部门
     */
    void deletDepartment(String deptNo);

    /**
     * 管理员修改某个部门的资料
     */
    void updateDepartment(Department department);

    /**
     * 管理员添加部门
     */
    void addDepartment(Department department);
}
