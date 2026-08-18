package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.RefTypes.Person;
import org.spring.solidfoundations.coreJava.RefTypes.RandD;
import org.spring.solidfoundations.coreJava.oop.PaymentProcessorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidFoundationsApplication.class, args);

        PaymentProcessorImpl paymentProcessor = new PaymentProcessorImpl();
        paymentProcessor.processPayment(1000.10, "USD");

    }

}
