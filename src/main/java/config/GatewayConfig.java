package config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GatewayConfig {
    @Bean
    public RouteLocator CustomRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route("while-cart-user-service-api",r ->r.path("/user-service/**")
                .filters(f->f.stripPrefix(1))
                .uri("http://localhost:8082")).build();
    }

}
