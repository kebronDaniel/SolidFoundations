package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.oop.modernInterfaces.PaymentProcessorImpl;
import org.spring.solidfoundations.coreJava.oop.staticCounter.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidFoundationsApplication.class, args);

        User user1 = new User();
        User user2 = new User();

        System.out.println(user1.getId());
        System.out.println(User.getCounter());
        System.out.println(user2.getId());
        System.out.println(User.getCounter());


    }

}
