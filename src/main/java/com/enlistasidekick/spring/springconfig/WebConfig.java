package com.enlistasidekick.spring.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.enlistasidekick.spring.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
 
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/resources/").setCachePeriod(31556926);
    }    
     
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = 
                    new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }  
}