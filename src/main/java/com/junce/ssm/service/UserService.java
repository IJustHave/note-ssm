package com.junce.ssm.service;

import com.junce.ssm.dto.Result;
import com.junce.ssm.model.UserBean;


public interface UserService {

    Result addUser(UserBean user);

    Result<UserBean> userLogin(UserBean user);
}
