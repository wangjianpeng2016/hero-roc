package com.test.mybatis.service;

import com.test.mybatis.entity.MybatisPerson;

import java.util.List;

public interface MyBatisPersonService {

    /**
     * @Description 保存用户信息
     * @author wangjp
     * @Date: 2017-11-12 9:26
     */
    void savePersons(List<MybatisPerson> persons);
}
