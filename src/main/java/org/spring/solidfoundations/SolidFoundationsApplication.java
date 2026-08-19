package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.oop.constructor.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidFoundationsApplication.class, args);

        Product product = new Product("new prod");
        System.out.println(product.getType());
    }

}
