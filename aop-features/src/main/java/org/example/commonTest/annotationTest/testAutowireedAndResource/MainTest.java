package org.example.commonTest.annotationTest.testAutowireedAndResource;

import org.example.util.GsonUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MainTest {
    //@Resource(name = "getCar")
    @Resource(name = "car0011")
    public Car getPeople;

    public static void main(String[] args) throws InterruptedException {
        //People p1 = new Solution().people01;
        ApplicationContext ac = new AnnotationConfigApplicationContext(ObjConfiguration.class, MainTest.class);
        MyObject p1 = ac.getBean(MainTest.class).getPeople;
        System.out.println(GsonUtils.getGson().toJson(p1));
        /*String[] beanNames = ac.getBeanDefinitionNames();
        for(int i=0; i< beanNames.length; i++) {
            System.out.println("=====>" + i + ":" + beanNames[i]);
        }*/

    }
}
