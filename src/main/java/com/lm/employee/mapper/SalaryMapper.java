package com.lm.employee.mapper;

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
}
