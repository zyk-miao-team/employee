package com.lm.employee.service;

import com.lm.employee.entity.Attendance;

import java.util.List;

public interface AttendanceService {
    /**
     * 查询个人考勤
     */
    List<Attendance> selectOneAttendance(String EmplId);
}
