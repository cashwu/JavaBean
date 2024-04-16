package com.cashwu.demo05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //        CommentService cs01 = context.getBean(CommentService.class);
        //        CommentService cs02 = context.getBean(CommentService.class);
        //        System.out.println(cs01 == cs02);

        //        CommentService commentService = context.getBean(CommentService.class);
        //        UserService userService = context.getBean(UserService.class);
        //        System.out.println(commentService.getCommentRepository() == userService.getCommentRepository());

        //        System.out.println("before call");
        //        CommentService2 service = context.getBean(CommentService2.class);
        //        System.out.println("after call");

        //        CommentService3 service01 = context.getBean(CommentService3.class);
        //        CommentService3 service02 = context.getBean(CommentService3.class);
        //        System.out.println(service01 == service02);

        //        CommentService4 commentService = context.getBean(CommentService4.class);
        //        UserService2 userService = context.getBean(UserService2.class);
        //
        //        System.out.println(commentService.getCommentRepository() == userService.getCommentRepository());

                CommentService4 commentService = context.getBean(CommentService4.class);
                commentService.sendComment("123");

    }

}
