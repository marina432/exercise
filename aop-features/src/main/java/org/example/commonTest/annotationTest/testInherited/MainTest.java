package org.example.commonTest.annotationTest.testInherited;


import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) {

        //目的一：获取给定类的、被特定注解类标记的所有子类
        Reflections reflections = new Reflections("org.example");
        Set<Class<? extends Fatherinterface>> subTypesOf = reflections.getSubTypesOf(Fatherinterface.class);
        subTypesOf.stream().forEach(clazz -> System.out.println(clazz.getTypeName()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        subTypesOf.stream().filter(clazz -> clazz.getAnnotation(Mark.class) != null).forEach(clazz -> System.out.println(clazz.getTypeName()));

        //目的二：验证@Inherited注解的"沿继承链向下传递性"
        System.out.println("======>Father注解：");
        final Annotation[] annotations = Father.class.getAnnotations();
        Arrays.stream(annotations).forEach(annotation -> System.out.println(annotation.annotationType().getName()));
        final Annotation[] annotations1 = SonExtendsFather.class.getAnnotations();
        System.out.println("======>Son注解：");
        Arrays.stream(annotations1).forEach(annotation -> System.out.println(annotation.annotationType().getName()));
        System.out.println("======>总结：说明在类与类的继承关系中，父类上的打Inherited标签的注解会被子类继承过来！");

        System.out.println("======>FatherInterface注解：");
        final Annotation[] annotations2 = Fatherinterface.class.getAnnotations();
        Arrays.stream(annotations2).forEach(annotation -> System.out.println(annotation.annotationType().getName()));
        System.out.println("======>SonInterface注解：");
        final Annotation[] annotations3 = SonInterface.class.getAnnotations();
        Arrays.stream(annotations3).forEach(annotation -> System.out.println(annotation.annotationType().getName()));
        System.out.println("======>总结：说明在接口与接口的继承关系中，父接口上的打Inherted标签的注解不会被子接口继承过来！");

        System.out.println("======>SonImplements:");
        final Annotation[] annotations4 = SonImplementsFatherInterface.class.getAnnotations();
        Arrays.stream(annotations4).forEach(annotation -> System.out.println(annotation.annotationType().getName()));
        System.out.println("======>说明：在类实现接口的关系中，接口上的打Inherted标签的注解不会被实现类继承过来！");
    }
}
