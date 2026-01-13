package com.pierre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        
        // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springdemo/spring.xml"));

        ApplicationContext factory = new ClassPathXmlApplicationContext("com/pierre/spring.xml");

        
        Alien obj = (Alien) factory.getBean("alien");
        obj.code();


        System.out.println(obj.getAge());

        

    }
}
