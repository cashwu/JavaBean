package com.cashwu.javabean02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author cash.wu
 * @since 2024/04/11
 */
@Configuration
@ComponentScan(basePackages = "com.cashwu.javabean02")
public class ProjectConfig {

    @Bean
    @Primary
    Parrot parrot() {

        var parrot = new Parrot();
        parrot.setName("cash");
        return parrot;
    }

    @Bean
    Parrot parrot02() {

        var parrot = new Parrot();
        parrot.setName("cash 02");
        return parrot;
    }

    @Bean(name = "parrot-03")
    Parrot parrot03() {

        var parrot = new Parrot();
        parrot.setName("cash 03");
        return parrot;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
