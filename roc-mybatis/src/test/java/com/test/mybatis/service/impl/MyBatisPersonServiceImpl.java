package com.test.mybatis.service.impl;

import com.test.mybatis.entity.MybatisPerson;
import com.test.mybatis.mapper.MyBatisPersonMapper;
import com.test.mybatis.service.MyBatisPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("myBatisPersonService")
public class MyBatisPersonServiceImpl implements MyBatisPersonService {

    private Logger logger = LoggerFactory.getLogger(MyBatisPersonServiceImpl.class);

    @Autowired
    private MyBatisPersonMapper myBatisPersonMapper;

    /**
     * @Description 保存用户信息
     * @author wangjp
     * @Date: 2017-11-12 9:26
     */
    @Transactional(propagation= Propagation.REQUIRED)
    public void savePersons(List<MybatisPerson> persons){

        for(MybatisPerson person :persons){
            myBatisPersonMapper.insert(person);
        }
        logger.debug("执行完了 savePersons{} ");

    }
}
