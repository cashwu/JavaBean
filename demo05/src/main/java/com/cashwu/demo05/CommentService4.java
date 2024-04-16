package com.cashwu.demo05;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author cash.wu
 * @since 2024/04/16
 */
@Service
@Getter
public class CommentService4 {

    @Autowired
    private CommentRepository2 commentRepository;

    @Autowired
    private ApplicationContext applicationContext;

    public void sendComment(String comment) {

//        CommentProcessor commentProcessor = new CommentProcessor();
        CommentProcessor commentProcessor = applicationContext.getBean(CommentProcessor.class);

        commentProcessor.processComment(comment);
        comment = commentProcessor.getComment();

        System.out.println(comment);
    }

}


