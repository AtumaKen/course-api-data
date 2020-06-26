//package com.kenoly.courseapi.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.*;
//import org.springframework.web.servlet.resource.PathResourceResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = "com.kenoly.courseapi")
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**")
//                .addResourceLocations("/resources/")
//        .setCachePeriod(3600)
//        .resourceChain(true)
//        .addResolver(new PathResourceResolver());
//    }
//
//    @Bean
//    public ViewResolver configureViewResolver() {
//        InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
//        viewResolve.setPrefix("/resources/");
//        viewResolve.setSuffix(".html");
//
//        return viewResolve;
//    }
//
//
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
//        configurer.enable();
//    }
//
//
//
//
//
//
//}
