package com.king.boot.bootdemo.controller;

import com.king.boot.bootdemo.service.AssignmentQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.pattern.PathPattern;

@RestController
@RequestMapping("/assignmentquery")
public class AssignmentQueryController {

    @Autowired
    private AssignmentQueryService assignmentQueryService;

    @RequestMapping("get/{id}")
    public String get(@PathVariable int id){
        return this.assignmentQueryService.getById(id).getName();
    }
}
