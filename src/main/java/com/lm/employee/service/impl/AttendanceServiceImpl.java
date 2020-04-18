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

    @Override
    public List<Attendance> selectAttendance() {
        List<Attendance> attendanceList=attendanceMapper.selectAttendance();
        return attendanceList;
    }

    @Override
    public String deletAttendance(String id) {
        try {
            attendanceMapper.deletAttendance(id);
            return "deleteSuccess";
        } catch (Exception e) {
            return "deleteFaild";
        }
    }

    @Override
    public String updateAttendance(Attendance attendance) {
        try {
            attendanceMapper.updateAttendance(attendance);
            return "updateSuccess";
        } catch (Exception e) {
            return "updateFaild";
        }
    }

    @Override
    public String addAttendance(Attendance attendance) {
        try {
            attendanceMapper.addAttendance(attendance);
            return "addSuccess";
        } catch (Exception e) {
            return "addFaild";
        }
    }
}
