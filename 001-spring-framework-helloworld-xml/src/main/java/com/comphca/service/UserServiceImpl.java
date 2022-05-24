package com.comphca.service;

import com.comphca.dao.UserMapper;
import com.comphca.pojo.User;
import lombok.Setter;

import java.util.List;

/**
 * @Created by comphca
 * @Date 2022/5/25 0:30
 * @Description TODO
 */
@Setter
public class UserServiceImpl {
    private UserMapper userMapper;

    public List<User> findUserList() {
        return userMapper.findUserList();
    }


}
