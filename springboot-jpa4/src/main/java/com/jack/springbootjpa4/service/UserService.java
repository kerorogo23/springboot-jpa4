package com.jack.springbootjpa4.service;

import com.jack.springbootjpa4.dto.UserLoginRequest;
import com.jack.springbootjpa4.dto.UserRegisterRequest;
import com.jack.springbootjpa4.entity.User;

public interface UserService {

    void register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
