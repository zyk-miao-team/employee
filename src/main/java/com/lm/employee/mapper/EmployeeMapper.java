package com.lm.employee.mapper;

import com.lm.employee.entity.Auth;
import com.lm.employee.entity.Employee;
import com.lm.employee.entity.ReqEmployeeVo;
import com.lm.employee.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface EmployeeMapper {
    /**
     * 查询用户登录密码
     */
    String selectPassword(@Param("emplId") String emplId);

    /**
     *查询用户权限
     */
    Auth selectAuth(String emplId);

    /**
     * 查询员工本人基本信息
     */
    Employee selectOneEmloyee(String emplId);

    /**
     * 查询所有员工基本信息（管理员权限）
     * @return
     */
    List<Employee> selectAllEmloyee(ReqEmployeeVo reqEmployeeVo);

    /**
     * 修改员工基本信息
     */
    Employee selectRole(String emplId);

    List<Test> selectAu(String emplId);

}
