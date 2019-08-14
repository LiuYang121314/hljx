package com.kingdee.hljx.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SessionFilter());
        registration.addUrlPatterns("/*");
        registration.setName("SessionFilter");
        registration.setOrder(1);
        return registration;
    }
}
