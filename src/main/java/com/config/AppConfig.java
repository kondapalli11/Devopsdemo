package com.config;
//  <context:annotation-config/><!--hey spring i want to go for annotation based apparch-->
//    <context:component-scan base-package="com.demo"/> <!--hey spring why not u do compoent scan of the pacakge com.demo-->

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = "com.demo")

public class AppConfig {
}
