package com.test.mybatis.provider;

public class MyBatisPersonProvider {

    public String queryPersonAndProfile(){
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT * ")
           .append(" FROM mybatis_person mp ")
           .append(" INNER JOIN mybatis_personal_profile mpp ON mp.profile_id = mpp.id_ ");

        return sql.toString();
    }
}
