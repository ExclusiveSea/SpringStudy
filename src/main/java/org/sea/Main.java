package org.sea;

import org.mybatis.spring.SqlSessionTemplate;
import org.sea.config.MainConfiguration;
import org.sea.mapper.TestMapper;
import org.sea.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        SqlSessionTemplate template = context.getBean(SqlSessionTemplate.class);
        TestService service = context.getBean(TestService.class);
        service.test();
    }
}
