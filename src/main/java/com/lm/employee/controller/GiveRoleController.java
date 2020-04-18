package com.lm.employee.controller;

import com.lm.employee.entity.GiveRole;
import com.lm.employee.entity.RoleEmplManage;
import com.lm.employee.service.GiveRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GiveRoleController {
    @Autowired
    private GiveRoleService giveRoleService;

    @RequestMapping(value = "/selectRole", method = RequestMethod.GET)
    public @ResponseBody RoleEmplManage selectRole() {
        List<GiveRole> giveRoleList = giveRoleService.selectRole();
        RoleEmplManage roleEmplManage=new RoleEmplManage();
        roleEmplManage.setCode("0");
        roleEmplManage.setMsg("success");
        roleEmplManage.setData(giveRoleList);
        return roleEmplManage;
    }

    @RequestMapping(value = "/addAuth", method = RequestMethod.POST)
    public  @ResponseBody String addAuth(String emplId, String roleId) {
        String result = giveRoleService.addAuth(emplId, roleId);
        return result;
    }

    @RequestMapping(value = "/updateAuth", method = RequestMethod.POST)
    public @ResponseBody String updateAuth(String emplId, String roleId) {
        String result = giveRoleService.updateAuth(emplId, roleId);
        return result;
    }

    @RequestMapping(value = "/deletAuth", method = RequestMethod.POST)
    public @ResponseBody String  deletAuth(String emplId){
        String result= giveRoleService.deletAuth(emplId);
        return result;
    }
}
