package com.lm.employee.controller;

import com.lm.employee.entity.Application;
import com.lm.employee.entity.ApplicationManage;
import com.lm.employee.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/selectApplication",method = RequestMethod.GET)
    public @ResponseBody ApplicationManage selectApplication(){
        List<Application> applicationList=applicationService.selectApplication();
        ApplicationManage applicationManage=new ApplicationManage();
        applicationManage.setCode("0");
        applicationManage.setMsg("success");
        applicationManage.setData(applicationList);
        return applicationManage;
    }

    @RequestMapping(value = "/deletApplication",method = RequestMethod.POST)
    public @ResponseBody String deletApplication(String id){
        String result=applicationService.deletApplication(id);
        return result;
    }

    @RequestMapping(value = "/updateApplication",method = RequestMethod.POST)
    public @ResponseBody String updateApplication(Application application){
        String result=applicationService.updateApplication(application);
        return result;
    }

    @RequestMapping(value = "/addApplication",method = RequestMethod.POST)
    public @ResponseBody String addApplication(Application application){
        String result=applicationService.addApplication(application);
        return result;
    }
}
