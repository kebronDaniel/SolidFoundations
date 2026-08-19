package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.equalsAndHash.Office;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidFoundationsApplication.class, args);

        var office1 = new Office("first",10);
        var office2 = new Office("first",10);

        Map<Office, String> map = new HashMap<>();
        map.put(office1, "first office");

        System.out.println(office1.equals(office2));
        System.out.println(map.get(office2));
    }

}
