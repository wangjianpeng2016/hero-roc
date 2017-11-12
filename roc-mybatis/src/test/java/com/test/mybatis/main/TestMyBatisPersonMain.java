package com.test.mybatis.main;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iframe.base.help.RowBoundHelper;
import com.iframe.common.util.LetterUtils;
import com.test.mybatis.entity.MybatisPerson;
import com.test.mybatis.mapper.MyBatisPersonMapper;
import com.test.mybatis.service.MyBatisPersonService;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description 单元测试
 * @author wangjp
 * @Date: 2017-11-11 14:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config-spring/test-spring-mybatis.xml"})
public class TestMyBatisPersonMain {

    private Logger logger = LoggerFactory.getLogger(TestMyBatisPersonMain.class);

    @Autowired
    private MyBatisPersonMapper myBatisPersonMapper;

    @Autowired
    private MyBatisPersonService myBatisPersonService;

    /**
     * @Description 保存用信息
     * @author wangjp
     * @Date: 2017-11-12 9:22
     */
    @Test
    public void savePerson(){

        List<String> names = LetterUtils.getLetter("Person");

        List<MybatisPerson> persons = new ArrayList<MybatisPerson>();

        Random random = new Random();
        for(String name :names){
            int age = random.nextInt(100);
            MybatisPerson person = new MybatisPerson(name, age);
            persons.add(person);
        }

        myBatisPersonService.savePersons(persons);

        logger.info("执行结束了...");
    }

    /**
     * @Description 使用通用Mapper查询全部用户
     * @author wangjp
     * @Date: 2017-11-12 9:02
     */
    @Test
    public void queryPersonAll(){
        List<MybatisPerson> personList = myBatisPersonMapper.selectAll();

        logger.info("执行结束了...");
    }

    /**
     * @Description 分页查询(PageHelper篇)
     * @author wangjp
     * @Date: 2017-11-12 9:35
     */
    @Test
    public void queryPersonPage(){

        //pageNum: 当前页，第一页是1
        //pageSize: 每页显示的行数:

        PageHelper.startPage(2, 5); //1.此处两行代码必须紧密贴合
        List<MybatisPerson> persons = myBatisPersonMapper.selectAll();//2.此处两行代码必须紧密贴合

        PageInfo<MybatisPerson> pageInfo = new PageInfo<MybatisPerson>(persons);

        logger.info("执行结束了...");
    }

    /**
     * @Description 使用 Example 过滤查询
     * @author wangjp
     * @Date: 2017-11-12 9:40
     */
    @Test
    public void queryByExample(){

        Example example = new Example(MybatisPerson.class);
        example.createCriteria().andBetween("age", 20, 35);

        List<MybatisPerson> persons = myBatisPersonMapper.selectByExample(example);

        logger.info("执行结束了...");
    }

    /**
     * @Description 基于外键的一对一关联查询
     * @author wangjp
     * @Date: 2017-11-12 10:37
     */
    @Test
    public void l2l(){

        List<MybatisPerson> persons = myBatisPersonMapper.queryPersonAndProfile();

        logger.info("执行结束了...");
    }

    /**
     * @Description 分页查询(RowBounds 篇)
     * @author wangjp
     * @Date: 2017-11-12 10:55
     */
    @Test
    public void queryPersonAndProfilePage(){

        //pageNum: 当前页，第一页是1
        //pageSize: 每页显示的行数:
        int pageNum = 1;
        int pageSize = 5;

        RowBounds rowBounds = RowBoundHelper.newRowBounds(pageNum, pageSize);

        List<MybatisPerson> persons = myBatisPersonMapper.queryPersonAndProfilePage(rowBounds);

        logger.info("执行结束了...");
    }

    /**
     * @Description 分页带参数
     * @author wangjp
     * @Date: 2017-11-12 11:06
     */
    @Test
    public void queryqueryPersonAndProfilePageAndParam(){
        Long phoneNum = 18600000015l;
        MybatisPerson person = new MybatisPerson();
        person.setAge(20);

        RowBounds rowBounds = RowBoundHelper.newRowBounds(1, 5);

        List<MybatisPerson> persons = myBatisPersonMapper
                        .queryqueryPersonAndProfilePageAndParam(phoneNum, person, rowBounds);

        logger.info("执行结束了...");
    }
}
