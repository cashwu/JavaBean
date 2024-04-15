package com.cashwu.demo04;

import com.cashwu.demo04.proxies.EmailCommentNotificationProxy;
import com.cashwu.demo04.repositories.DBCommentRepository;
import com.cashwu.demo04.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

//        DBCommentRepository dbCommentRepository = new DBCommentRepository();
//        EmailCommentNotificationProxy emailCommentNotificationProxy = new EmailCommentNotificationProxy();
//        CommentService commentService = new CommentService(dbCommentRepository, emailCommentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("cash");
        comment.setText("demo comment");

        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }

}
