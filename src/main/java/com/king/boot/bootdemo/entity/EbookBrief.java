package com.king.boot.bootdemo.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EbookBrief {
    private long id;
    private long createTime;
    private long updateTime;
    private boolean available;
    private String name;
    private String section;
    private String grade;
    private String subject;
    private String material;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List<String> getGradeCodes(){
        return deserialize(this.grade);
    }

    public List<String> getSubjectCodes(){
        return deserialize(this.subject);
    }

    public List<String> getMaterialIds(){
        return deserialize(this.material);
    }

    public String serialize(List<String> datas){
        if(datas==null||datas.size()<1)
            return "";
        return String.join("|",datas);
    }

    public List<String> deserialize(String encodeData){
        if(encodeData==null||encodeData=="")
            return new ArrayList<>();
      return Arrays.asList(encodeData.split("\\|")) ;
    }

}
