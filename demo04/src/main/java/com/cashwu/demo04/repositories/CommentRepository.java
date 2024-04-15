package com.cashwu.demo04.repositories;

import com.cashwu.demo04.Comment;

/**
 * @author cash.wu
 * @since 2024/04/15
 */
public interface CommentRepository {
    void store(Comment comment);
}

