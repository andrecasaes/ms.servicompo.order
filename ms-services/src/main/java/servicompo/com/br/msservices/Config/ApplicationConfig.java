package servicompo.com.br.msservices.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ApplicationConfig implements WebMvcConfigurer {
    @Value("${MS_CORS:}")
    private String CORS_ENABLE ;
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
        .allowedOrigins(CORS_ENABLE)
        .allowedMethods("POST", "GET",  "PUT", "OPTIONS", "DELETE");
        //WebMvcConfigurer.super.addCorsMappings(registry);
    }
}