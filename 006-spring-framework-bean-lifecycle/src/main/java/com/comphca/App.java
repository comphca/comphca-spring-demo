package com.comphca;


import com.comphca.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
@Slf4j
public class  App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        log.info("Init application context");
        // create and configure beans
         AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "com.comphca");

        // retrieve configured instance
        User user = (User) context.getBean("user");

        // print info from beans
        log.info(user.toString());

        log.info("Shutdown application context");
        context.registerShutdownHook();


    }
}
