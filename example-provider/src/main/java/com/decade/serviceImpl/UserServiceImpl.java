package com.decade.serviceImpl;

import com.decade.entity.CommonUser;
import com.decade.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public CommonUser getUserById(Integer id) {
        //假装查到了
        CommonUser commonUser = new CommonUser();
        commonUser.setUserId(id);
        commonUser.setUsername("decade");
        return commonUser;
    }
}
