package com.sumitaccess007.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DBConfiguration {

    @Bean
    @Profile("dev")
    public void setupDEVDB(){
        System.out.println("In DEV DB");
    }

    @Bean
    @Profile("qa")
    public void setupQADB(){
        System.out.println("In QA DB");
    }

    @Bean
    @Profile("uat")
    public void setupUATDB(){
        System.out.println("In UAT DB");
    }

    @Bean
    @Profile("prod")
    public void setupPRODDB(){
        System.out.println("In PROD DB");
    }
}
