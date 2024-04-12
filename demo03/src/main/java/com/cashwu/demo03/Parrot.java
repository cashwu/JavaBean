package com.cashwu.demo03;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cash.wu
 * @since 2024/04/12
 */
//@Data
//public class Parrot {
//
//    private String name;
//
//    public Parrot() {
//        System.out.println("create parrot");
//    }
//}

//@Data
//@Component
//public class Parrot {
//
//    private String name = "koko";
//
////    private Person person;
////
////    @Autowired
////    public Parrot(Person person) {
////        this.person = person;
////    }
//}

@Data
public class Parrot {

    private String name = "koko";
}
