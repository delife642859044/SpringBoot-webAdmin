package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//MVC视图控制
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/index");
        registry.addViewController("/toLogin").setViewName("login");
        registry.addViewController("/login").setViewName("login");
    }
    /*拦截器配置*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*注册拦截器*/
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/static/**", "/login", "/userLogin");
    }
}
