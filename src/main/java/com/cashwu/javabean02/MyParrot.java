package com.cashwu.javabean02;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class MyParrot{
    private String name;

    @PostConstruct
    public void init(){
        this.name = "my parrot";
    }
}
