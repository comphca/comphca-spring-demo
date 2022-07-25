package com.comphca.config;

import com.comphca.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Created by comphca
 * @Date 2022/5/28 15:32
 * @Description TODO
 */
@Configuration
public class beanConfig {

    @Bean(name = "user", initMethod = "doInit", destroyMethod = "doDestroy")
    public User getUser() {
        User user = new User();
        user.setName("comphca");
        user.setAge(18);
        return user;
    }
}

