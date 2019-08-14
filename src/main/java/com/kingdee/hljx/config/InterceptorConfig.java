package com.kingdee.hljx.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO Auto-generated method stub
        //WebMvcConfigurer.super.addInterceptors(registry);
//		registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/*").excludePathPatterns("/static/*");
    }

}
