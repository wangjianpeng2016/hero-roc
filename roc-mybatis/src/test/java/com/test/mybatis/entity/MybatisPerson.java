package com.test.mybatis.entity;

import com.iframe.base.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="mybatis_person")
public class MybatisPerson extends IdEntity {

    @Column(name="name_")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
