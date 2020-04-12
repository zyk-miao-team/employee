package com.lm.employee.controller;

import com.lm.employee.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;

    @RequestMapping(value = "/selectImage", method = RequestMethod.POST)
    public @ResponseBody String selectImage(String emplId){
        String imageUrl=imageService.selectImage(emplId);
        return imageUrl;
    }

    @RequestMapping(value = "/addImage", method = RequestMethod.POST)
    public @ResponseBody void addImage(String emplId, String imageUrl) {
        String imgUrl=imageService.selectImage(emplId);
        if (imgUrl==null){
            imageService.addImage(emplId, imageUrl);
        }else {
            imageService.updateImage(emplId, imageUrl);
        }

    }

//    @RequestMapping(value = "/updateImage", method = RequestMethod.POST)
//    public void updateImage(String emplId,String imageUrl){
//        imageService.updateImage(emplId, imageUrl);
//    }
}
