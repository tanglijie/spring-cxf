package com.controller;

import com.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tang on 2018/5/19.
 */
@RestController
public class UserController {

    @RequestMapping("test")
    public String getUser(){
        JaxWsProxyFactoryBean ws=new JaxWsProxyFactoryBean();
        ws.setAddress("http://localhost:8081/user/userInfo?wsdl");
        ws.setServiceClass(UserService.class);
        UserService o = (UserService) ws.create();
        System.out.println(o.getUserInfo().getName());
        return "success";
    }
}
