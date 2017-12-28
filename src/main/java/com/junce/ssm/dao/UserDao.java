package com.junce.ssm.dao;

import com.junce.ssm.model.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(UserBean user);

    /**
     * 通过 手机号 或 用户名查询 用户
     *
     * @param userPhone
     * @param userName
     * @return
     */
    UserBean selectUserByPhoneOrName(@Param("userPhone") String userPhone, @Param("userName") String userName);

}
