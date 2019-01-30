package com.king.boot.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping("hello")
    public String hello(){
        return String.format("用户的姓名：%s,年龄：%d",studentProperties.getName(),studentProperties.getAge());
    }

}
