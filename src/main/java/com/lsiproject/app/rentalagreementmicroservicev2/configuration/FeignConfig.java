package com.lsiproject.app.rentalagreementmicroservicev2.configuration;

import org.springframework.context.annotation.Bean;

public class FeignConfig {
    @Bean
    feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }
}
