package com.lm.employee.service;

public interface ImageService {
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
