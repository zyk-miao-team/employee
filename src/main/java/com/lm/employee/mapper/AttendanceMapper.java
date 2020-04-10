package com.lm.employee.mapper;

import com.lm.employee.entity.Attendance;
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
}
