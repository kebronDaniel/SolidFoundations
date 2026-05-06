package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.Person;
import org.spring.solidfoundations.coreJava.RandD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {
        Person p = new Person("Person One");
        RandD.change(p);
        System.out.println(p.getName());

        SpringApplication.run(SolidFoundationsApplication.class, args);
    }

}
