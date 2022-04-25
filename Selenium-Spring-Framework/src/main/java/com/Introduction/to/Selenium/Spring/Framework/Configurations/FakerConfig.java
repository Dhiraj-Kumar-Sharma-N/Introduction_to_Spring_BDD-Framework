package com.Introduction.to.Selenium.Spring.Framework.Configurations;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class FakerConfig {

    @Bean
    public Faker getfaker(){
        return new Faker();
    }
}
