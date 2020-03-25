package com.ht.springboot.config;

import com.ht.springboot.intercept.MyIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    @Autowired
    private MyIntercept myIntercept;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myIntercept).addPathPatterns("/**");
    }
}
