package com.lm.employee.mapper;

import com.lm.employee.entity.Application;
import com.lm.employee.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplicationMapper {
    /**
     * 查询所有应聘信息
     */
    List<Application> selectApplication();

    /**
     *管理员删除某个应聘信息
     */
    void deletApplication(String id);

    /**
     * 管理员修改某个应聘信息
     */
    void updateApplication(Application application);

    /**
     * 添加应聘人员信息
     */
    void addApplication(Application application);
}
