package com.test.mybatis.entity;

import com.iframe.base.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="mybatis_person")
public class MybatisPerson extends IdEntity {

    @Column(name="name_")
    private String name;

    @Column(name="age_")
    private int age;

    public MybatisPerson() {
    }

    public MybatisPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
