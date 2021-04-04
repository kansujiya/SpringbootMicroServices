package com.spring.microservice.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        //builder.url("jdbc:postgressql://localhost:5432/nisha_girl");
        builder.url("jdbc:h2:mem:testdb");
        System.out.println("My Custom database has been initialized");
        return builder.build();
    }
}
