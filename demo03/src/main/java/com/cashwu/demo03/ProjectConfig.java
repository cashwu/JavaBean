package com.cashwu.demo03;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cash.wu
 * @since 2024/04/12
 */
@Configuration
@ComponentScan(basePackages = "com.cashwu.demo03")
public class ProjectConfig {

//    @Bean
//    public Parrot parrot(){
//        Parrot parrot = new Parrot();
//        parrot.setName("koko");
//        return parrot;
//    }

//    @Bean
//    public Person person(Parrot parrot){
//        Person person = new Person();
//        person.setName("Ella");
//
//        person.setParrot(parrot);
//        return person;
//    }

//    @Bean
//    public Person person(){
//        Person person = new Person();
//        person.setName("Ella");
//
//        person.setParrot(parrot());
//        return person;
//    }


        @Bean
        public Parrot parrot01(){
            Parrot parrot = new Parrot();
            parrot.setName("koko01");
            return parrot;
        }

        @Bean
        public Parrot parrot02(){
            Parrot parrot = new Parrot();
            parrot.setName("koko02");
            return parrot;
        }

//        @Bean
//        public Person person(@Qualifier("parrot02") Parrot parrot){
//
//            Person person = new Person();
//            person.setName("Ella");
//
//            person.setParrot(parrot);
//            return person;
//        }

}
