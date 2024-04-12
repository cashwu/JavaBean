package com.cashwu.demo03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo03Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot parrot = context.getBean(Parrot.class);
//        System.out.println(parrot);

        Person person = context.getBean(Person.class);
        System.out.println(person);


    }

}
