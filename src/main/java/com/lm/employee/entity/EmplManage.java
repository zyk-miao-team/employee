package com.lm.employee.entity;

import lombok.Data;

import java.util.List;

@Data
public class EmplManage {
    private String msg;
    private String code;
    private List<Employee> data;
}
