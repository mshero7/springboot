package com.cafe24.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cafe24.config.web.FileuploadConfig;
import com.cafe24.config.web.MVCConfig;
import com.cafe24.config.web.MessageConfig;
import com.cafe24.config.web.SecurityConfig;

//@Configuration
//@EnableAspectJAutoProxy
//@EnableWebMvc
//@ComponentScan({"com.cafe24.mysite.controller"})
//@Import({MVCConfig.class,SecurityConfig.class,MessageConfig.class, FileuploadConfig.class})
public class WebConfig implements WebMvcConfigurer{

}
