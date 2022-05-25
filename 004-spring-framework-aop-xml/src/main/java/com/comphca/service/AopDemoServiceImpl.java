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
public class AopDemoServiceImpl {
    public void doMethod1() {
        System.out.println("AopDemoServiceImpl.doMethod1()");
    }

    public String doMethod2() {
        System.out.println("AopDemoServiceImpl.doMethod2()");
        return "hello world";
    }

    public String doMethod3() throws Exception {
        System.out.println("AopDemoServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }


}
