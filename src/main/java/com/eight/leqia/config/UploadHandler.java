package com.eight.leqia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UploadHandler implements WebMvcConfigurer {
    /**
     * 搭建虚拟路径
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:E:\\S3Down\\S3Project\\miniprogram-7\\miniprogram-7\\images\\goods\\");
    }
}
