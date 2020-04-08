package com.lm.employee.service.impl;

import com.lm.employee.entity.Salary;
import com.lm.employee.mapper.SalaryMapper;
import com.lm.employee.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public List<Salary> selectOneSalary(String emplId) {
        List<Salary> listSalary=salaryMapper.selectOneSalary(emplId);
        return listSalary;
    }
}
