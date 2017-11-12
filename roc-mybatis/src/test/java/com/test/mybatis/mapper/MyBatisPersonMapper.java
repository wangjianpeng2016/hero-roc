package com.test.mybatis.mapper;

import com.test.mybatis.entity.MybatisPerson;
import com.test.mybatis.provider.MyBatisPersonProvider;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface MyBatisPersonMapper extends Mapper<MybatisPerson> {

    /**
     * @Description 查询用户和个人简介
     * @author wangjp
     * @Date: 2017-11-12 10:41
     */
    @SelectProvider(type = MyBatisPersonProvider.class, method = "queryPersonAndProfile")
    @ResultMap({"queryPersonAndProfileResultMap"})
    public List<MybatisPerson> queryPersonAndProfile();
}
