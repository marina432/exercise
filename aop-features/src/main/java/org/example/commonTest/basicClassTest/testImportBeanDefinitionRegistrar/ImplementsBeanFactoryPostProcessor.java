package org.example.commonTest.basicClassTest.testImportBeanDefinitionRegistrar;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ImplementsBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("=========目前处于容器启动阶段：immplements BeanFactoryPostProcessor==============");
    }
}
