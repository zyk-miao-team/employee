package com.lm.employee.entity;

import lombok.Data;

import java.util.List;
@Data
public class AttendanceManage {
    private String msg;
    private String code;
    private List<Attendance> data;
}
