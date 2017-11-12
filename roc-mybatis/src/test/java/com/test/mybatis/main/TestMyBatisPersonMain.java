package com.test.mybatis.main;

import com.test.mybatis.entity.MybatisPerson;
import com.test.mybatis.mapper.MyBatisPersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description 单元测试
 * @author wangjp
 * @Date: 2017-11-11 14:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config-spring/test-spring-mybatis.xml"})
public class TestMyBatisPersonMain {

    @Autowired
    private MyBatisPersonMapper myBatisPersonMapper;

    /**
     * @Description 使用通用Mapper查询全部用户
     * @author wangjp
     * @Date: 2017-11-12 9:02
     */
    @Test
    public void queryPersonAll(){
        List<MybatisPerson> personList = myBatisPersonMapper.selectAll();

        System.out.println();
    }

    public void savePerson(){

    }
}
