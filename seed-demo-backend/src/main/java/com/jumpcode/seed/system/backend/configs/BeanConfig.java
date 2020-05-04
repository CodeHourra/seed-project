package com.jumpcode.seed.system.backend.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jumpcode
 */
@Configuration
public class BeanConfig {
    @Bean
    public AppInit appInitBean() {
        return new AppInit();
    }
}
