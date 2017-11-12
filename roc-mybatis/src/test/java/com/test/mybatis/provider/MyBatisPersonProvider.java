package com.test.mybatis.provider;

import com.test.mybatis.entity.MybatisPerson;
import org.apache.ibatis.annotations.Param;

public class MyBatisPersonProvider {

    /**
     * @Description 
     * @author wangjp
     * @param 
     * @return 
     * @Date: 2017-11-12 11:08
     */
    public String queryPersonAndProfile(){
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * ")
           .append(" FROM mybatis_person mp ")
           .append(" INNER JOIN mybatis_personal_profile mpp ON mp.profile_id = mpp.id_ ");

        return sql.toString();
    }

    /**
     * @Description 
     * @author wangjp
     * @param 
     * @return
     * @Date: 2017-11-12 11:09
     */
    public String queryqueryPersonAndProfilePageAndParam(){
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * ")
                .append(" FROM mybatis_person mp ")
                .append(" INNER JOIN mybatis_personal_profile mpp ON mp.profile_id = mpp.id_ ")
                .append(" WHERE ")
                .append(" mp.age_ > #{person.age} ")
                .append(" AND mpp.phone_num > #{phoneNum}");

        return sql.toString();
    }
}
