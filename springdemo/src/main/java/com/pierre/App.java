package com.pierre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        
        // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springdemo/spring.xml"));

        ApplicationContext factory = new ClassPathXmlApplicationContext("com/pierre/spring.xml");

        Alien obj1 = (Alien) factory.getBean("alien");
        Alien obj = (Alien) factory.getBean("alien");

        obj1.code();
        obj1.age = 15;
        System.out.println(obj.age);
        System.out.println(obj1.age);
        System.out.println(obj == obj1);


    }
}
