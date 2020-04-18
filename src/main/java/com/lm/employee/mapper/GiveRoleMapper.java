package com.lm.employee.mapper;

import com.lm.employee.entity.GiveRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GiveRoleMapper {
    /**
     * 超级管理员查询拥有角色
     */
    List<GiveRole> selectRole();

    /**
     * 超级管理员新增管理员
     */
    void addAuth(String emplId, String roleId);

    /**
     * 超级管理员修改某员工的角色
     */
    void updateAuth(String emplId, String roleId);

    /**
     * 超级管理员删除某员工的角色
     */
    void deletAuth(String emplId);
}
