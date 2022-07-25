package com.comphca.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Created by comphca
 * @Date 2022/5/28 15:32
 * @Description TODO
 */

@Slf4j
public class User  implements BeanFactoryAware, BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {
    private String name;
    private Integer age;


    public User() {
        log.info("excute constuct User");
    }

    /**
     * bean factory.
     */
    private BeanFactory beanFactory;

    /**
     * application context.
     */
    private ApplicationContext applicationContext;

    /**
     * bean name.
     */
    private String beanName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        log.info("execute User#setName({})", name);
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        log.info("execute User#setAge({})", age);
        this.age = age;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("execute BeanFactoryAware#setBeanFactory");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        log.info("execute BeanNameAware#setBeanName");
        this.beanName = s;
    }

    @Override
    public void destroy() throws Exception {
        log.info("execute DisposableBean#destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("execute InitializingBean#afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("execute ApplicationContextAware#setApplicationContext");
        this.applicationContext = applicationContext;
    }

    public void doInit() {
        log.info("execute User#doInit");
    }

    public void doDestroy() {
        log.info("execute User#doDestroy");
    }
}
