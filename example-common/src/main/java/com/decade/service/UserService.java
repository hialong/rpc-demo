package com.decade.service;

import com.decade.entity.CommonUser;

public interface UserService {

    /**
     * 通过id获取用户
     * @param id
     * @return
     */
    CommonUser getUserById(Integer id);

}
