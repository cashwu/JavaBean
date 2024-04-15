package com.cashwu.demo04.proxies;

import com.cashwu.demo04.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author cash.wu
 * @since 2024/04/15
 */
@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.printf("sending email notification for comment : %s %n", comment);
    }
}
