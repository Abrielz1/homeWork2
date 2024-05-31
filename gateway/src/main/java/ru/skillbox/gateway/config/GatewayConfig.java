package ru.skillbox.gateway.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.skillbox.gateway.filter.CustomGlobalFilter;

@Configuration
public class GatewayConfig {
    @Bean
    GlobalFilter customGF() {
        return new CustomGlobalFilter();
    }

//    @Bean
//    RouteLocator customRoutes(RouteLocatorBuilder builder) {
//        return builder
//                .routes()
//                .route("order-service",
//                        r -> r.path("/skillbox/api/order/**")
//                                .uri("lb://order-service")
//                ).build();
//    }
}
