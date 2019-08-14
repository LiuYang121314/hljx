package com.kingdee.hljx.config;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSourceConfiguration {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ApplicationContext applicationContext;


    @Bean("main")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.main")
    public HikariDataSource mainDataSource() {
        return new HikariDataSource();
    }

    @Primary
    @Bean
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
//        //配置默认的数据源
        dynamicDataSource.setDefaultTargetDataSource(mainDataSource());
//        //配置多数据源的key 一定是string 类型，枚举类型并不支持 ，，所以用枚举的话需要转成String 类型
//
        Map<Object, Object> dataSourceMap = new HashMap<>();
        dataSourceMap.put(DataSourceNames.MAIN, mainDataSource());

        dataSourceMap.putAll(getDataSources());

        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }

    private Map<Object, Object> getDataSources() {
        Map<Object, Object> map = new HashMap<>();
        Connection conn = null;
        try {
            HikariDataSource main = mainDataSource();
            conn = main.getConnection();
            String sql = "SELECT * FROM [t_ad_kdAccount_gl]";
            Statement sta = conn.createStatement();
            ResultSet set = sta.executeQuery(sql);
            while (set.next()) {
                String fAcctID = set.getString("FAcctID");
                String fAcctNumber = set.getString("FAcctNumber");
                String fdbName = set.getString("FDBName");
                String fConnectString = set.getString("FConnectString");
                String fSysUser = set.getString("FSysUser");
                String fSysPwd = set.getString("FSysPwd");

                ConfigurableApplicationContext context = (ConfigurableApplicationContext) applicationContext;
////		        //Bean的实例工厂
                DefaultListableBeanFactory factory = (DefaultListableBeanFactory) context.getBeanFactory();
                BeanDefinitionBuilder dataSourceBuider = BeanDefinitionBuilder.genericBeanDefinition(HikariDataSource.class);


                dataSourceBuider.addPropertyValue("driverClassName", main.getDriverClassName());
                dataSourceBuider.addPropertyValue("jdbcUrl", "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=" + fdbName);
                dataSourceBuider.addPropertyValue("username", fSysUser);
                dataSourceBuider.addPropertyValue("password", fSysPwd);
                factory.registerBeanDefinition("DB_" + fAcctID, dataSourceBuider.getBeanDefinition());

                DataSourceNames.addDataSourceName("DB_" + fAcctID, "DB_" + fAcctID);
                map.put("DB_" + fAcctID, context.getBean("DB_" + fAcctID));


//                HikariDataSource hi = new HikariDataSource();
//                hi.setJdbcUrl("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=" + fdbName);
//                hi.setDriverClassName(main.getDriverClassName());
//                hi.setPassword(fSysPwd);
//                hi.setUsername(fSysUser);


//                HikariDataSource hikari = factory.getBean(HikariDataSource.class);
//                hikari.setJdbcUrl("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=" + fdbName);
//                hikari.setDriverClassName(main.getDriverClassName());
//                hikari.setPassword(fSysPwd);
//                hikari.setUsername(fSysUser);

//                map.put(fAcctNumber, hikari);
//				map.put(fAcctNumber, app.getBean(fAcctNumber));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            logger.warn("ERROR:{}", e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return map;
    }
}
