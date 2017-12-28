package com.junce.ssm.service.impl;

import com.junce.ssm.constant.CommConstant;
import com.junce.ssm.dao.UserDao;
import com.junce.ssm.dto.Result;
import com.junce.ssm.model.UserBean;
import com.junce.ssm.service.UserService;
import com.junce.ssm.utils.Encrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public Result addUser(UserBean user) {
        UserBean localUser = userDao.selectUserByPhoneOrName(user.getUserPhone(), user.getUserName());
        if (localUser != null && localUser.getUserPhone().endsWith(user.getUserPhone())) {
            return new Result(CommConstant.PHONE_IS_EXIST, "手机号码已被注册", null);
        }
        user.setUserPwd(Encrypt.md5(user.getUserPwd()));
        int result = userDao.addUser(user);
        if (result > 0) {
            return new Result(CommConstant.SUCCESS, "注册成功", null);
        } else {
            return new Result(CommConstant.SERVER_ERROR, "服务器错误", null);
        }
    }

    @Override
    public Result<UserBean> userLogin(UserBean user) {

        UserBean localUser = userDao.selectUserByPhoneOrName(user.getUserPhone(), user.getUserName());
        if (localUser == null) {
            return new Result<>(CommConstant.USERNAME_NOT_EXIST, "用户不存在", null);
        }


        if (!Encrypt.md5(user.getUserPwd()).equals(localUser.getUserPwd())) {
            return new Result<>(CommConstant.PASSWORD_ERROR, "密码错误", null);
        }

        return new Result<UserBean>(CommConstant.SUCCESS, "登陆成功", localUser);
    }
}
