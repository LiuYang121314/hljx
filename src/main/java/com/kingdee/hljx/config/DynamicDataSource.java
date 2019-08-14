package com.kingdee.hljx.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

    private Logger logger = LoggerFactory.getLogger(DynamicDataSource.class);

    @Override
    protected Object determineCurrentLookupKey() {
        String string = DataSourceContextHodler.getDataSource();
        logger.info("切换到数据源:{}", string);
        return string;
    }
}
