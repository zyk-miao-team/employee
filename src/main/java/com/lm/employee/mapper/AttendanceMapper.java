package com.lm.employee.mapper;

import com.lm.employee.entity.Attendance;
import com.lm.employee.entity.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AttendanceMapper {
    /**
     * 查询个人考勤
     */
    List<Attendance> selectOneAttendance(String emplId);

    /**
     * 查询所有考勤信息
     */
    List<Attendance> selectAttendance();

    /**
     *管理员删除某条考勤信息
     */
    void deletAttendance(String id);

    /**
     * 管理员修改某条考勤信息
     */
    void updateAttendance(Attendance attendance);

    /**
     * 添加考勤记录
     */
    void addAttendance(Attendance attendance);
}
