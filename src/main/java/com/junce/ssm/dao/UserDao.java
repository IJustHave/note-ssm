package com.junce.ssm.dao;

import com.junce.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface UserDao {

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 通过 手机号 或 用户名查询 用户
     *
     * @param userPhone
     * @param userName
     * @return
     */
    User selectUserByPhoneOrName(@Param("userPhone") String userPhone, @Param("userName") String userName);

}
