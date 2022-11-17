package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class RegisterInterceptorRegistry extends WebMvcConfigurerAdapter {
   @Autowired
   HandlleInterceptor handlleInterceptor;

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(handlleInterceptor);
   }
   
   
   
}