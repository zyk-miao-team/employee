package com.lm.employee.mapper;

import com.lm.employee.entity.Image;
import com.lm.employee.entity.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ImageMapper {
    /**
     * 查询个人头像
     */
    String selectImage(String emplId);

    /**
     * 添加个人头像
     */
    void addImage(String emplId,String imageUrl);

    /**
     * 更改个人头像
     */
    void updateImage(String emplId,String imageUrl);
}
