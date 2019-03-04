package com.king.boot.bootdemo.service;

import com.king.boot.bootdemo.entity.EbookBrief;
import com.king.boot.bootdemo.mapper.EbookRepository;
import com.king.boot.bootdemo.mapper.EbookSelectCondition;
import com.king.boot.bootdemo.mapper.EbookSelectSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookRepository _ebookRepository;

    public List<EbookBrief> searchEbookBeiefs(EbookSelectCondition filter){
       return this._ebookRepository.getEbookBriefs(filter);
    }
}
