package com.example.Parcialweb23;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
                .allowCredentials(false);
    }

    // Otro código de configuración y métodos adicionales pueden ir aquí

    // Ejemplo de configuración de beans para otras funcionalidades (si es necesario)
    // @Bean
    // public SomeBean someBean() {
    //     return new SomeBean();
    // }
}
