package ru.skillbox.gateway.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skillbox.gateway.filter.CustomGlobalFilter;

@Configuration
public class GatewayConfig {
    @Bean
    GlobalFilter customGF() {
        return new CustomGlobalFilter();
    }
}
