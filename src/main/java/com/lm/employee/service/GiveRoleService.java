package com.lm.employee.service;

import com.lm.employee.entity.GiveRole;

import java.util.List;

public interface GiveRoleService {
    /**
     * 超级管理员查询拥护角色及对应权限
     */
    List<GiveRole> selectRole();

    /**
     * 超级管理员新增管理员
     */
    String addAuth(String emplId,String roleId);

    /**
     * 超级管理员修改某员工的权限
     */
    String updateAuth(String emplId, String roleId);

    /**
     * 超级管理员删除某员工的权限
     */
    String deletAuth(String emplId);
}
