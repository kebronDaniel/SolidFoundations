package org.spring.solidfoundations.coreJava.oop.modernInterfaces;

public class PaymentProcessorImpl implements PaymentProcessor {

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("processing payment ....");
        if (!currency.equals("EURO")){
            amount = PaymentProcessor.currencyConverter(amount,currency);
            System.out.println("Current amount  - " + amount);
        }
        System.out.println("Payment is processed");
    }
}
