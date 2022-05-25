package com.comphca.service;

import org.springframework.stereotype.Service;

/**
 * @Created by comphca
 * @Date 2022/5/26 0:18
 * @Description TODO
 */
@Service
public class JDKProxyServiceImpl implements IJDKProxyService{
    @Override
    public void doMethod1() {
        System.out.println("JDKProxyServiceImpl.doMethod1");
    }

    @Override
    public String doMethod2() {
        System.out.println("JDKProxyServiceImpl.doMethod2");
        return "JDKProxyServiceImpl doMethod2 Return";
    }

    @Override
    public String doMethod3() throws Exception {
        System.out.println("JDKProxyServiceImpl.doMethod3");
        throw new Exception("some exception");
    }
}
