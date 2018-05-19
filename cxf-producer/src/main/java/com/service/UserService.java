package com.service;

import com.bean.User;

import javax.jws.WebService;


/**
 * Created by Tang on 2018/5/19.
 */
@WebService
public interface UserService {
    User getUserInfo();
}
