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
     * 查询用户姓名
     */
    String selectName(String emplId);
    /**
     *查询用户权限
     */
    Auth selectAuth(String emplId);

    /**
     * 查询员工个人基本信息
     */
    Employee selectOneEmloyee(String emplId);

    /**
     * 查询所有员工基本信息（管理员权限）
     * @return
     */
    List<Employee> selectAllEmloyee();

    /**
     * 修改密码
     */
    void updatePassword(String emplId,String oldPwd,String newPwd);

    /**
     *查询权限
     */
    List<Test> selectAu(String emplId);

    /**
     * 管理员删除某个员工
     */
    void deletEmployee(String emplId);

    /**
     * 管理员修改某个员工的资料
     */
    void updateEmployee(Employee employee);

}
