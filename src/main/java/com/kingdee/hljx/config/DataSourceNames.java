package com.kingdee.hljx.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class DataSourceNames {
    private static final Map<String, String> dataSourceName = new HashMap<>();
    public static final String MAIN = "MAIN";

    static {
        dataSourceName.put(MAIN, MAIN);
    }

    public static void addDataSourceName(String key, String name) {
        dataSourceName.put(key, name);
    }

    public static String getDataSourceName(String key) {
        return dataSourceName.get(key);
    }

    public static void removeDataSourceName(String key) {
        dataSourceName.remove(key);
    }
}
