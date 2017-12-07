package com.iframe.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @功能说明: Swagger的自定义配置
 * @author: wangjp
 * @Date: 2017-06-13 下午 10:18
 */
@EnableWebMvc
@EnableSwagger2
@Configuration
//@Profile({"development"})
public class SwaggerConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.iframe")) //需要扫描的Controller路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {

        Contact contact = new Contact("Hero鹏","www.crazyboy2016.com","wangjianpeng228@163.com");

        return new ApiInfoBuilder()
                .title("Hero Roc 在线API")
                .description("Hero鹏,一个伟大的名字")
                .termsOfServiceUrl("www.crazyboy2016.com")
                .contact(contact)
                //.license("熊猫")
                //.licenseUrl("www.baidu.com")
                .version("1.1")
                .build();
    }
}
