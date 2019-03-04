package com.king.boot.bootdemo.mapper;

import com.king.boot.bootdemo.entity.EbookBrief;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EbookRepository {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "available", column = "available"),
            @Result(property = "name", column = "name"),
            @Result(property = "section", column = "section"),
            @Result(property = "grade", column = "grade"),
            @Result(property = "subject", column = "subject"),
            @Result(property = "material", column = "material")
    })
    @SelectProvider(type = EbookSelectSql.class,method = "selectEbooks")
    List<EbookBrief> getEbookBriefs(EbookSelectCondition condition);
}
