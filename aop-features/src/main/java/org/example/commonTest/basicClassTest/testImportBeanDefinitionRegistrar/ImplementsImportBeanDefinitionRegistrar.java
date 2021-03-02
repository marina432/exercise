package org.example.commonTest.basicClassTest.testImportBeanDefinitionRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.util.Map;

public class ImplementsImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * 该方法将在容器启动阶段执行，实现动态注入指定类型bean到容器中
     * @param annotationMetadata
     * @param beanDefinitionRegistry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        System.out.println("=========目前处于容器启动阶段：implements ImportBeanDefinitionRegistrar ==============");

        //以下指定注入目标类型的对象到容器中
        //扫描注解
        Map<String, Object> annotationAttributes = annotationMetadata
                .getAnnotationAttributes(ComponentScan.class.getName());
        String[] basePackages = (String[]) annotationAttributes.get("basePackages");

        //扫描类
        ClassPathBeanDefinitionScanner scanner =
                new ClassPathBeanDefinitionScanner(beanDefinitionRegistry, false);
        //TypeFilter helloServiceFilter = new AssignableTypeFilter(ImportBeanDefinitionRegistrar.class);
        TypeFilter helloServiceFilter = new AssignableTypeFilter(TestInterface.class);      //此处指定目标

        scanner.addIncludeFilter(helloServiceFilter);
        scanner.scan(basePackages);
    }
}
