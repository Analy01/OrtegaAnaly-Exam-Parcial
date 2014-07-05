package com.analy.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/**
 *
 * @author T107
 */

public class WebApp extends AbstractAnnotationConfigDispatcherServletInitializer{


    @Override
    protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[0];
    }


    @Override
    protected Class<?>[] getServletConfigClasses() {
       return new Class<?>[]{WebAppConfig.class};
    }


    @Override
    protected String[] getServletMappings() {
    return new String[]{
      "/calificacion/*"  
    };
        
    }
    
}
