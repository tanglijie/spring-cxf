package com.service.impl;

import com.bean.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Tang on 2018/5/19.
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfo() {
        User user = new User();
        user.setName("zhangsan");
        return user;
    }
}
