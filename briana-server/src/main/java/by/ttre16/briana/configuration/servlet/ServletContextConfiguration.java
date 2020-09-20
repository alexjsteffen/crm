package by.ttre16.briana.configuration.servlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.http.converter.json
        .MappingJackson2HttpMessageConverter;

import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan({"by.ttre16.briana.controller"})
public class ServletContextConfiguration implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(
            List<HttpMessageConverter<?>> converters) {
        converters.add(messageConverter());
    }

    @Bean
    public MappingJackson2HttpMessageConverter messageConverter() {
        return new MappingJackson2HttpMessageConverter();
    }
}
