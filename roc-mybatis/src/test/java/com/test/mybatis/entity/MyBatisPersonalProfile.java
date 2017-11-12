package com.test.mybatis.entity;

import com.iframe.base.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="mybatis_personal_profile")
public class MyBatisPersonalProfile extends IdEntity {

    @Column(name="address")
    private String address;

    @Column(name="phone_num")
    private Long phoneNum;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }
}
