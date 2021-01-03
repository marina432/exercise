package org.example.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
@Configuration
public class AspectJDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring-aop-context.xml");
        AspectJDemo demo = context.getBean(AspectJDemo.class);
        System.out.println(demo);
    }
}
