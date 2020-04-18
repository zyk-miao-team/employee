package com.lm.employee.entity;

import lombok.Data;

import java.util.List;

@Data
public class SalaryManage {
    private String msg;
    private String code;
    private List<Salary> data;
}
