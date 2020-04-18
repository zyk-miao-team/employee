package com.lm.employee.service.impl;

import com.lm.employee.entity.GiveRole;
import com.lm.employee.mapper.GiveRoleMapper;
import com.lm.employee.service.GiveRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiveRoleServiceImpl implements GiveRoleService {
    @Autowired
    private GiveRoleMapper giveRoleMapper;

    @Override
    public List<GiveRole> selectRole() {
        List<GiveRole> giveRoleList = giveRoleMapper.selectRole();
        return giveRoleList;
    }

    @Override
    public String addAuth(String emplId, String roleId) {
        try {
            giveRoleMapper.addAuth(emplId, roleId);
            return "addSuccess";
        } catch (Exception e) {
            return "addFaild";
        }
    }

    @Override
    public String updateAuth(String emplId, String roleId) {
        try {
            giveRoleMapper.updateAuth(emplId, roleId);
            return "updateSuccess";
        } catch (Exception e) {
            return "updateFaild";
        }
    }

    @Override
    public String deletAuth(String emplId) {
        try {
            giveRoleMapper.deletAuth(emplId);
            return "deleteSuccess";
        } catch (Exception e) {
            return "deleteFaild";
        }
    }
}
