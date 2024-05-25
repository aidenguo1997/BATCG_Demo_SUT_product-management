package com.vincent.demo.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Book Store")
                .version("Ver. 1.0.2")
                .description("書店商品API").termsOfService("https://github.com/ntub46010/SpringBootTutorial/tree/Ch8");

        return new OpenAPI()
                .info(info);
    }
}
