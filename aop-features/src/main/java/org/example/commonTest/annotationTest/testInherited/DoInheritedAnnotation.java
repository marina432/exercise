package org.example.commonTest.annotationTest.testInherited;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface DoInheritedAnnotation {
}
