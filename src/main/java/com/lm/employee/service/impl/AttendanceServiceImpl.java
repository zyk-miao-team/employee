package com.lm.employee.service.impl;

import com.lm.employee.entity.Attendance;
import com.lm.employee.mapper.AttendanceMapper;
import com.lm.employee.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;

    @Override
    public List<Attendance> selectOneAttendance(String emplId) {
        List<Attendance> attendanceList =attendanceMapper.selectOneAttendance(emplId);
        return attendanceList;
    }
}
