package com.king.boot.bootdemo.mapper;

import org.apache.ibatis.jdbc.SQL;

public class EbookSelectSql {
    public String selectEbooks(EbookSelectCondition condition){
        String sql=new SQL(){{
            SELECT("*");
            FROM("ebook-tb");
            WHERE("1=1");
            if(condition.getName()!=null){
                AND();
                WHERE("name like #{name}");
            }
            if(condition.getSection()!=null){
                AND();
                WHERE("section = #{section}");
            }
            if(condition.getGrade()!=null){
                AND();
                WHERE("grade like #{grade}");
            }
            if(condition.getSubject()!=null){
                AND();
                WHERE("subject like #{subject}");
            }
            if(condition.getMaterial()!=null){
                AND();
                WHERE("material like #{material}");
            }

        }}.toString();

        return sql;
    }
}
