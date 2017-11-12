package com.iframe.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;

/**
 * @Description 全局时间拦截器
 * @author wangjp
 * @Date: 2017-11-12 12:47
 */
@Component("globalEventInterceptor")
public class GlobalEventInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger("customAppender");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);

        BufferedReader bufferedReader = null;
        StringBuilder param = new StringBuilder("请求参数");
        try {
            bufferedReader = request.getReader();
            String readLine = null;
            while ((readLine=bufferedReader.readLine())!=null){
                param.append(readLine);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }
        }

        return Boolean.TRUE;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView modelAndView) throws Exception {

        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;

        logger.debug("请求耗时: "+executeTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception e) throws Exception {

    }
}
