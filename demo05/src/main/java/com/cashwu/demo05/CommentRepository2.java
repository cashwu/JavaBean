package com.cashwu.demo05;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author cash.wu
 * @since 2024/04/16
 */
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository2 {
}
