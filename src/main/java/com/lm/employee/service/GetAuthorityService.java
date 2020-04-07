package com.lm.employee.service;

import com.lm.employee.entity.Auth;

import java.util.List;

public interface GetAuthorityService {
    List<Auth> selectByEmplId(String emplId);
}
