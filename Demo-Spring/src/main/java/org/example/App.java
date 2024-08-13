package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext oo = new ClassPathXmlApplicationContext("spring.xml");
        Dev o = oo.getBean(Dev.class);
        o.build();

        //System.out.println(o.getAge());
    }
}
