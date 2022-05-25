package com.comphca;

import com.comphca.pojo.User;
import com.comphca.service.CGLibProxyService;
import com.comphca.service.IJDKProxyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.comphca");


        // retrieve configured instance
        IJDKProxyService ijdkProxyService = context.getBean(IJDKProxyService.class);
        ijdkProxyService.doMethod1();
        ijdkProxyService.doMethod2();
        try {
            ijdkProxyService.doMethod3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println( "-------------------------------------------------------------------------------" );


        CGLibProxyService cgLibProxyService = context.getBean(CGLibProxyService.class);
        cgLibProxyService.doMethod1();
        cgLibProxyService.doMethod2();
        try {
            cgLibProxyService.doMethod3();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
