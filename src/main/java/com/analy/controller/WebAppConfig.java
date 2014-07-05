package com.analy.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 *
 * @author T107
 */
public class WebAppConfig {

@EnableWebMvc
@Configuration
@ComponentScan("com.analy.controller")




public class WebAppConfig extends WebMvcConfigurerAdapter {
    
}

}
