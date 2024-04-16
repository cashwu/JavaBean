package com.cashwu.demo05;

import lombok.Getter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author cash.wu
 * @since 2024/04/16
 */
@Getter
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private String comment;

    public void processComment(String comment) {

        this.comment = comment;
    }

}
