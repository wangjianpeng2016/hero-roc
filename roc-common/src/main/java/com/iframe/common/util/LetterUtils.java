package com.iframe.common.util;

import java.util.ArrayList;
import java.util.List;

public class LetterUtils {

    /**
     * @功能说明: 得到有序的英文字母
     * @author: wangjp
     * @Date: 2017年4月10日 下午9:47:24
     */
    public static List<String> getLetter(){
        List<String> result = new ArrayList<String>();

        for(int i=65; i<65+26; i++){
            char ch = (char) (i);
            result.add(String.valueOf(ch));
        }

        return result;
    }

    /**
     * @功能说明: 带有前缀的字符串
     * @author: wangjp
     * @Date: 2017年4月10日 下午10:17:59
     */
    public static List<String> getLetter(String name){
        List<String> result = new ArrayList<String>();

        for(int i=65; i<65+26; i++){
            char ch = (char) (i);

            String letter = String.valueOf(ch);
            result.add(name+"-"+letter);
        }

        return result;
    }
}
