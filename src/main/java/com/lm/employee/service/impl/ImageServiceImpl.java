package com.lm.employee.service.impl;

import com.lm.employee.mapper.ImageMapper;
import com.lm.employee.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Override
    public String selectImage(String emplId) {
        String imageUrl=imageMapper.selectImage(emplId);
        return imageUrl;
    }

    @Override
    public void addImage(String emplId, String imageUrl) {
        imageMapper.addImage(emplId,imageUrl);
    }

    @Override
    public void updateImage(String emplId, String imageUrl) {
         imageMapper.updateImage(emplId,imageUrl);
    }
}
