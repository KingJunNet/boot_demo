package com.king.boot.bootdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignmentquery")
public class AssignmentQueryController {

    @RequestMapping("get/{id}")
    public String get(@PathVariable int id){
        return String.format("King%d",id);
    }
}
