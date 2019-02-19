package com.king.boot.bootdemo.service;

import com.king.boot.bootdemo.entity.Assignment;
import com.king.boot.bootdemo.mapper.AssignmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentQueryService {

    @Autowired
    private AssignmentMapper assignmentRepository;

    public Assignment getById(int id){
//        return new Assignment(id,String.format("king%d",id),1);
        return this.assignmentRepository.getById(id);
    }
}
