package com.apedad.example.commons;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author RocLiu [apedad@qq.com]
 * @version 1.0
 */
@Slf4j
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        log.info("当前数据源：{}"+ DynamicDataSourceContextHolder.get());
        return DynamicDataSourceContextHolder.get();
    }
}
