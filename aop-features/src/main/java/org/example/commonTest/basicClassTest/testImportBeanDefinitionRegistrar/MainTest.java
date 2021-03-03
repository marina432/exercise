package org.example.commonTest.basicClassTest.testImportBeanDefinitionRegistrar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import java.util.Arrays;

@ComponentScan(basePackages = {"org.example.commonTest.basicClassTest.testImportBeanDefinitionRegistrar"})
@Import({ImplementsBeanFactoryPostProcessor.class, ImplementsImportBeanDefinitionRegistrar.class})
public class MainTest {

    public static void main(String[] args) {
        System.out.println("主线程main");
        new MainTest().beAwayFromStatic();
    }

    public void beAwayFromStatic() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MainTest.class);
        System.out.println("容器启动完成");
        Arrays.stream(ac.getBeanDefinitionNames()).forEach(s -> System.out.println(s));
        System.out.println(ac.getBean("justDoATest"));
    }
}
