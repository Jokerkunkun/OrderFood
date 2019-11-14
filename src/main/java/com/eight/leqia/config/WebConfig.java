package com.eight.leqia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("login");
    }
    // 注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                // 下面配置的是不进行拦截的路径
                .excludePathPatterns("/","/login.html","/qt/*","/qt/list","/","/admin/login","/admin/toLogin","/css/**","/fonts/**","/upload/**","/js/**","/images/**",
                        "/lib/**");
    }

}
