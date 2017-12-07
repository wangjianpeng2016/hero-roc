package com.iframe.business.controller;

import com.iframe.business.entity.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 登录控制器
 * @author wangjp
 * @Date: 2017-11-12 13:01
 */
@Controller
@Api(value="loginController",description="登陆控制器")
@RequestMapping("/loginController")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    /**
     * @Description 登录接口
     * @author wangjp
     * @Date: 2017-11-12 13:02
     */
    @ResponseBody
    @ApiOperation(value="登陆接口的描述", httpMethod="POST", produces= MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value="/login", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserInfo> login(@RequestBody UserInfo userInfo){

        UserInfo result = new UserInfo();
        result.setUsername("admin");
        result.setPassword("123456");

        logger.debug("请求登录接口...");
        return new ResponseEntity<UserInfo>(result, HttpStatus.OK);
    }
}




