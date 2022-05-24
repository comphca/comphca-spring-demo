package com.comphca.dao;

import com.comphca.pojo.User;

import java.util.Collections;
import java.util.List;

/**
 * @Created by comphca
 * @Date 2022/5/25 0:32
 * @Description TODO
 */
public class UserMapper {
    public List<User> findUserList() {
        return Collections.singletonList(new User("comphca", 18));
    }
}
