package com.lm.employee.service;

import com.lm.employee.entity.Auth;
import com.lm.employee.entity.Role;

import java.util.List;

public interface GetAuthorityService {
    /**
     * 查询权限
     */
    List<Auth> selectByEmplId(String emplId);

}
