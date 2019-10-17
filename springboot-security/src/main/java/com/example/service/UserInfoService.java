package com.example.service;

import com.example.entity.UserInfo;

public interface UserInfoService {
    UserInfo findByUsername(String username);
}
