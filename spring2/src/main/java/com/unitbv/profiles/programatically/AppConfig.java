package com.unitbv.profiles.programatically;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    @Profile("dev")
    DevDataSourceConfig devDataSourceConfig()
    {
        return new DevDataSourceConfig();
    }

    @Bean
    @Profile("prod")
    ProdDataSourceConfig prodDataSourceConfig()
    {
        return new ProdDataSourceConfig();
    }

    @Bean
    @Profile("default")
    DevDataSourceConfig defaultSource()
    {
        return new DevDataSourceConfig();
    }
}