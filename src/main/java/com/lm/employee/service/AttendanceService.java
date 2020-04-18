package com.lm.employee.service;

import com.lm.employee.entity.Attendance;

import java.util.List;

public interface AttendanceService {
    /**
     * 查询个人考勤
     */
    List<Attendance> selectOneAttendance(String EmplId);

    /**
     * 查询所有考勤信息
     */
    List<Attendance> selectAttendance();

    /**
     *管理员删除某条考勤信息
     */
    String deletAttendance(String id);

    /**
     * 管理员修改某条考勤信息
     */
    String updateAttendance(Attendance attendance);

    /**
     * 添加考勤记录
     */
    String addAttendance(Attendance attendance);
}
