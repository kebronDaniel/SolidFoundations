package org.spring.solidfoundations;

import org.spring.solidfoundations.oop.encap.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(BigDecimal.valueOf(12));
        bankAccount.withdraw(BigDecimal.valueOf(2));
        System.out.println(bankAccount.getBalance());
        SpringApplication.run(SolidFoundationsApplication.class, args);
    }

}
