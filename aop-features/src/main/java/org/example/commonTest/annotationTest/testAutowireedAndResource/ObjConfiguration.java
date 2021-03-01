package org.example.commonTest.annotationTest.testAutowireedAndResource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjConfiguration {

    @Bean({"car002", "car004"})
    public Car getCar() {
        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        return new Car();
    }

    @Bean({"car001", "car003"})
    public People getPeople() {
        System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPP");
        return new People();
    }
}
