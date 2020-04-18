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

    @Override
    public List<Salary> selectSalary() {
        List<Salary> salaryList=salaryMapper.selectSalary();
        return salaryList;
    }

    @Override
    public String deletSalary(String id) {
        try {
            salaryMapper.deletSalary(id);
            return "deleteSuccess";
        } catch (Exception e) {
            return "deleteFaild";
        }
    }

    @Override
    public String updateSalary(Salary salary) {
        try {
            salaryMapper.updateSalary(salary);
            return "updateSuccess";
        } catch (Exception e) {
            return "updateFaild";
        }
    }

    @Override
    public String addSalary(Salary salary) {
        try {
            salaryMapper.addSalary(salary);
            return "addSuccess";
        } catch (Exception e) {
            return "addFaild";
        }
    }
}
