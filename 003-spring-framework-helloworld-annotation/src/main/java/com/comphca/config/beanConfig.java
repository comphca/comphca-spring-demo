package com.comphca.config;

import com.comphca.aspect.LogAspect;
import com.comphca.dao.UserMapper;
import com.comphca.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Created by comphca
 * @Date 2022/5/25 21:19
 * @Description TODO
 */
@Configuration
@EnableAspectJAutoProxy  /*配置类中有切面类需要开启这个注解*/
public class beanConfig {


}
