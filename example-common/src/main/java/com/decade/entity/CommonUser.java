package com.decade.entity;

import java.io.Serializable;

/**
 * 公共类User，实现序列化接口方便在网络中传输
 */
public class CommonUser implements Serializable {
    private String username;
    private Integer userId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
