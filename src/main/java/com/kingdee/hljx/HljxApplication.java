package com.kingdee.hljx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ServletComponentScan
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HljxApplication {

    public static void main(String[] args) {
        SpringApplication.run(HljxApplication.class, args);
    }

}
