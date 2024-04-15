package com.cashwu.demo04.proxies;

import com.cashwu.demo04.Comment;

/**
 * @author cash.wu
 * @since 2024/04/15
 */
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
