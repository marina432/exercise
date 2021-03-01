package org.example.commonTest.annotationTest.testAutowireedAndResource;

import org.springframework.beans.factory.annotation.Value;

public class People implements MyObject {

    @Value("小明")
    String name;
}
