package com.lm.employee.controller;

import com.lm.employee.entity.Attendance;
import com.lm.employee.entity.AttendanceManage;
import com.lm.employee.entity.Salary;
import com.lm.employee.entity.SalaryManage;
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

    @RequestMapping(value = "/selectAttendance",method = RequestMethod.GET)
    public @ResponseBody AttendanceManage selectAttendance(){
        List<Attendance> attendanceList=attendanceService.selectAttendance();
        AttendanceManage attendanceManage=new AttendanceManage();
        attendanceManage.setCode("0");
        attendanceManage.setMsg("success");
        attendanceManage.setData(attendanceList);
        return attendanceManage;
    }

    @RequestMapping(value = "/deletAttendance",method = RequestMethod.POST)
    public @ResponseBody String deletAttendance(String id){
        String result=attendanceService.deletAttendance(id);
        return result;
    }

    @RequestMapping(value = "/updateAttendance",method = RequestMethod.POST)
    public @ResponseBody String updateAttendance(Attendance attendance){
        String result=attendanceService.updateAttendance(attendance);
        return result;
    }

    @RequestMapping(value = "/addAttendance",method = RequestMethod.POST)
    public @ResponseBody String addAttendance(Attendance attendance){
        String result=attendanceService.addAttendance(attendance);
        return result;
    }
}
