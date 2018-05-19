package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tang on 2018/5/19.
 */
@RestController
public class UserController {


    @RequestMapping("getUser")
    public String getUser(){

        return "success";
    }

}
