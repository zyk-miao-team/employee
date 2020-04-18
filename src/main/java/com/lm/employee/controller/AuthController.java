package com.lm.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {
    @RequestMapping(value = "/selectAuth",method = RequestMethod.GET)
    public @ResponseBody String selectAuth(){

        return null;
    }
}
