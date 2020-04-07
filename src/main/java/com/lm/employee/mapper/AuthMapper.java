package com.lm.employee.mapper;

import com.lm.employee.entity.Auth;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AuthMapper {
    /**
     * 查询权限
     */
    List<Auth> selectAuth(String emplId);
}
