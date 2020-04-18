package com.lm.employee.service.impl;

import com.lm.employee.entity.Application;
import com.lm.employee.entity.Department;
import com.lm.employee.mapper.ApplicationMapper;
import com.lm.employee.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public List<Application> selectApplication() {
        List<Application> applicationList=applicationMapper.selectApplication();
        return applicationList;
    }

    @Override
    public String deletApplication(String id) {
        try {
            applicationMapper.deletApplication(id);
            return "deleteSuccess";
        } catch (Exception e) {
            return "deleteFaild";
        }
    }

    @Override
    public String updateApplication(Application application) {
        try {
            applicationMapper.updateApplication(application);
            return "updateSuccess";
        } catch (Exception e) {
            return "updateFaild";
        }
    }

    @Override
    public String addApplication(Application application) {
        try {
            applicationMapper.addApplication(application);
            return "addSuccess";
        } catch (Exception e) {
            return "addFaild";
        }
    }
}
