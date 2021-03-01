package org.example.commonTest.annotationTest.testInherited;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mark {
}
