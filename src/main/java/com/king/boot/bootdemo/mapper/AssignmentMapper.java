package com.king.boot.bootdemo.mapper;

import com.king.boot.bootdemo.entity.Assignment;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentMapper {
    Assignment getById(int id);
}
