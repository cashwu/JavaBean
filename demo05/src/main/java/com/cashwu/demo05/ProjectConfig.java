package com.cashwu.demo05;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author cash.wu
 * @since 2024/04/16
 */
@Configuration
@ComponentScan(basePackages = "com.cashwu.demo05")
public class ProjectConfig {

//    @Bean
//    public CommentService commentService() {
//
//        return new CommentService();
//    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService3 commentService() {

        return new CommentService3();
    }
}
