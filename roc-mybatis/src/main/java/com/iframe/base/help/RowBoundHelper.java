package com.iframe.base.help;

import org.apache.ibatis.session.RowBounds;

public class RowBoundHelper {

    /**
     * @Description 创建一个RowBounds对象
     * @author wangjp
     * @param pageNum,当前页面
     * @param pageSize,每页显示的记录数
     * @return RowBounds,实体对象
     * @Date: 2017-11-8 14:30
     */
    public static RowBounds newRowBounds(int pageNum, int pageSize){

        int start = pageSize*(pageNum-1);

        int end = pageSize*pageNum;

        return new RowBounds(start, end);
    }
}
