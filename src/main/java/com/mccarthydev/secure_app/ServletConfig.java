package com.mccarthydev.secure_app;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<HelloServlet> helloServlet() {
        ServletRegistrationBean<HelloServlet> servletRegistrationBean = new ServletRegistrationBean<>(new HelloServlet(), "/hello");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }
}

