package com.cashwu.demo05;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author cash.wu
 * @since 2024/04/16
 */
@Service
@Lazy
public class CommentService2 {

    public CommentService2() {
        System.out.println("CommentService2 create");
    }
}
