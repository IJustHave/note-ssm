package com.junce.ssm.controller;

import com.junce.ssm.constant.CommConstant;
import com.junce.ssm.dto.Result;
import com.junce.ssm.model.UserBean;
import com.junce.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/register")
    public Result userRegister(UserBean user) {
        if (StringUtils.isEmpty(user.getUserPhone())) {
            return new Result(CommConstant.PHONE_IS_EMPTY, "手机号码为空", "");
        }

        if (StringUtils.isEmpty(user.getUserPwd())) {
            return new Result(CommConstant.PASSWORD_IS_EMPTY, "密码为空", "");
        }
        user.setCreateTime(new Date());
        user.setUserId(UUID.randomUUID().toString());

        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping("/login")
    public Result<UserBean> userLogin(UserBean user) {
        if (StringUtils.isEmpty(user.getUserPhone())){
            return new Result(CommConstant.PHONE_IS_EMPTY, "手机号码为空", null);
        }

        if (StringUtils.isEmpty(user.getUserPwd())) {
            return new Result(CommConstant.PASSWORD_IS_EMPTY, "密码为空", null);
        }

        return userService.userLogin(user);
    }

}
