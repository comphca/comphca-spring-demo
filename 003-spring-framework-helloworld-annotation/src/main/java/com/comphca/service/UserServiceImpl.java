package com.comphca.service;

import com.comphca.dao.UserMapper;
import com.comphca.pojo.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Created by comphca
 * @Date 2022/5/25 0:30
 * @Description TODO
 */
@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public List<User> findUserList() {
        System.out.println("findUserList");
        return userMapper.findUserList();
    }


}
