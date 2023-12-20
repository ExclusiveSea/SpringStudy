package org.sea.service.impl;

import org.sea.mapper.TestMapper;
import org.sea.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper mapper;

    @Transactional   //此注解表示事务，之后执行的所有方法都会在同一个事务中执行
    public void test() {
//        mapper.insertStudent();
////        if(true) throw new RuntimeException("我是测试异常！");
////        mapper.insertStudent();
        System.out.println("我是业务方法");
    }
}
