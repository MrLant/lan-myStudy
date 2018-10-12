package com.lan.config;

import com.lan.constants.myStudyConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //外部访问路径
        //例:/localhost:8080/static/jpg/.....
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/", "file:" + myStudyConstants.file_path);
        super.addResourceHandlers(registry);
    }
}
