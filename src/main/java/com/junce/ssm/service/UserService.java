package com.junce.ssm.service;

import com.junce.ssm.dto.Result;
import com.junce.ssm.model.User;


/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {

    Result addUser(User user);

    Result<User> userLogin(User user);
}
