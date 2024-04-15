package com.cashwu.demo04.services;

import com.cashwu.demo04.Comment;
import com.cashwu.demo04.proxies.CommentNotificationProxy;
import com.cashwu.demo04.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author cash.wu
 * @since 2024/04/15
 */
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.store(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
