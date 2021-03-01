package org.example.commonTest.annotationTest.testAutowireedAndResource;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car implements MyObject{

    @Value("清洁能源汽车")
    String type;

    @PostConstruct
    public void init1() {
        System.out.println("===================init1==========");
    }

    @PostConstruct
    public void init2() {
        System.out.println("==========init2================");
    }

    @PreDestroy
    public void destroy2() {
        System.out.println("==========destroy2================");
    }

    @PreDestroy
    public void destroy1() {
        System.out.println("==========destroy1================");
    }
}
