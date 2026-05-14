package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.RefTypes.Person;
import org.spring.solidfoundations.coreJava.RefTypes.RandD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {

        // String literals
        // these are stored in a string pool(heap).
        String a = "Hello";
        String b = "Hello";
        // this is stored out of the string pool and stored like the other objects.
        String c = new String("Hello");

        // == is a reference comparator.
        System.out.println(a == b);
        System.out.println(a == c);
        // .equal compares the values
        System.out.println(a.equals(c));

        // Hashmaps using an object as a key because the class has overridden equals and hashcode.
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("joe"),"Doe");

        System.out.println(map.get(new Person("joe")));

        SpringApplication.run(SolidFoundationsApplication.class, args);
    }

}
