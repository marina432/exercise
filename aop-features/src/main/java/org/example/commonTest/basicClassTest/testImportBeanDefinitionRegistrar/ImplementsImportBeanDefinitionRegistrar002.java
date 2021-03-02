package org.example.commonTest.basicClassTest.testImportBeanDefinitionRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ImplementsImportBeanDefinitionRegistrar002 implements ImportBeanDefinitionRegistrar, TestInterface {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        System.out.println("==========只实现ImportBeanDefinitionRegistrar，无自动注入代码，看是否被注入=========》结构证明被注入了！");
    }
}
