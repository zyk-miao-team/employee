package com.lm.employee.controller;

import com.lm.employee.entity.Attendance;
import com.lm.employee.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    @RequestMapping(value = "/selectOneAttendance", method = RequestMethod.POST)
    public @ResponseBody List<Attendance> selectOneAttendance(HttpServletRequest request) {
         String emplId=request.getParameter("emplid");
         List<Attendance> attendanceList=attendanceService.selectOneAttendance(emplId);
         return attendanceList;
    }
}
