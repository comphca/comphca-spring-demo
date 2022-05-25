package com.comphca.service;

import com.comphca.dao.UserMapper;
import com.comphca.pojo.User;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Created by comphca
 * @Date 2022/5/25 0:30
 * @Description TODO
 */
@Service
public class CGLibProxyService {
    public void doMethod1() {
        System.out.println("CgLibProxyService.doMethod1()");
    }

    public String doMethod2() {
        System.out.println("CgLibProxyService.doMethod2()");
        return "hello world";
    }

    public String doMethod3() throws Exception {
        System.out.println("CgLibProxyService.doMethod3()");
        throw new Exception("some exception");
    }


}
