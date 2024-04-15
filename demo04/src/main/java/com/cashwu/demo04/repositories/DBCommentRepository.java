package com.cashwu.demo04.repositories;

import com.cashwu.demo04.Comment;
import org.springframework.stereotype.Repository;

/**
 * @author cash.wu
 * @since 2024/04/15
 */
@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void store(Comment comment) {

        System.out.printf("store comment : %s %n", comment);
    }
}
