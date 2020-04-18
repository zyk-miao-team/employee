package com.lm.employee.mapper;

import com.lm.employee.entity.Application;
import com.lm.employee.entity.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SalaryMapper {
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
    void deletSalary(String id);

    /**
     * 管理员修改某条薪资信息
     */
    void updateSalary(Salary salary);

    /**
     * 添加工资记录
     */
    void addSalary(Salary salary);
}
