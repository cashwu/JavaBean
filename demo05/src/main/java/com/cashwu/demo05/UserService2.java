package com.cashwu.demo05;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cash.wu
 * @since 2024/04/16
 */
@Service
@Getter
public class UserService2 {

    @Autowired
    private CommentRepository2 commentRepository;

}
