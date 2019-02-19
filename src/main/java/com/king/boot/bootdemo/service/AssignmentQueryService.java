package com.king.boot.bootdemo.service;

import com.king.boot.bootdemo.entity.Assignment;
import org.springframework.stereotype.Service;

@Service
public class AssignmentQueryService {

    public Assignment getById(int id){

        return new Assignment(id,String.format("king%d",id),1);
    }
}
