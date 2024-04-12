package com.cashwu.demo03;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author cash.wu
 * @since 2024/04/12
 */
//@Data
//public class Person {
//    private String name;
//    private Parrot parrot;
//}

//@Data
//@Component
//public class Person {
//    private String name;
//
//    @Autowired
//    private Parrot parrot;
//}

//@Data
//@Component
//public class Person {
//
//    private String name = "Ella";
//
//    private final Parrot parrot;
//
//    @Autowired
//    public Person(Parrot parrot) {
//        this.parrot = parrot;
//    }
//}

//@Data
//public class Person {
//
//    private String name = "Ella";
//
//    private Parrot parrot;
//}

@Data
@Component
public class Person {

    private String name = "Ella";

    private final Parrot parrot;

    @Autowired
    public Person(@Qualifier("parrot02") Parrot parrot) {
        this.parrot = parrot;
    }
}


