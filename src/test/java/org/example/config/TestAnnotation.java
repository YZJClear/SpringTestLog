package org.example.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YourName
 * @date 2020-07-31 22:58
 */
public class TestAnnotation {
    @Test
    public void test1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
    }
}
