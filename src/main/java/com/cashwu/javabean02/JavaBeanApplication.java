package com.cashwu.javabean02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBeanApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(context.getBean(Parrot.class));

        System.out.println(context.getBean("parrot02", Parrot.class));
        System.out.println(context.getBean("parrot-03", Parrot.class));

        System.out.println(context.getBean(MyParrot.class));

        Parrot parrot = new Parrot();
        parrot.setName("register");

        context.registerBean("registerParrot",
                             Parrot.class,
                             () -> parrot,
                             bd -> bd.setPrimary(true));

        Parrot registerParrot = context.getBean("registerParrot", Parrot.class);
        System.out.println(registerParrot);

        //        System.out.println(context.getBean(String.class));
//        System.out.println(context.getBean(Integer.class));
    }

}



