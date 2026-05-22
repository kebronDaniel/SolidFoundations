package org.spring.solidfoundations;

import org.spring.solidfoundations.oop.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.HashMap;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(BigDecimal.valueOf(12));
        bankAccount.freeze();
        bankAccount.withdraw(BigDecimal.valueOf(2));
        SpringApplication.run(SolidFoundationsApplication.class, args);
    }

}
