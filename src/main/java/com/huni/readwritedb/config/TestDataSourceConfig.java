package com.huni.readwritedb.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@Profile("test")
public class TestDataSourceConfig {

    @Bean
    public DataSource writeDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder()
                .setName("writeDB")
                .setType(EmbeddedDatabaseType.H2)
                .setScriptEncoding("UTF-8");
        return builder.build();
    }

    @Bean
    public DataSource readDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder()
                .setName("readDB")
                .setType(EmbeddedDatabaseType.H2)
                .setScriptEncoding("UTF-8");
        return builder.build();
    }
}
