package org.example.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.example.util.GsonUtils;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 编程方式创建@AspectJ动态代理.
 */
@Slf4j
public class AspectApiDemo {
    public static void main(String[] args) {
        Map<String, Object> cache = new HashMap<>();
        AspectJProxyFactory proxyFactory = new AspectJProxyFactory(cache);
        proxyFactory.addAdvice((MethodBeforeAdvice) (method, args1, o) -> {
            if("put".equals(method.getName()) && args1.length == 2) {
                System.out.println(String.format("方法put被调用，入参key: %s, value: %s", args1[0], args1[1]));
            }
        });

        Map<String, Object> mapProxy = proxyFactory.getProxy();
        mapProxy.put("age", "18");
        log.info(GsonUtils.getGson().toJson(mapProxy));
        log.info(GsonUtils.getGson().toJson(cache));
    }
}
