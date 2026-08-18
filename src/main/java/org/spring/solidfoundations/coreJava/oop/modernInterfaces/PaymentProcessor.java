package org.spring.solidfoundations.coreJava.oop.modernInterfaces;

public interface PaymentProcessor {

    String BASE_CURRENCY="EURO";
    int MAX_TRANSACTION_LIMIT=10000;

    void processPayment(double amount, String currency);

    default boolean processRefund(double amount, String currency){
        System.out.println("Process started to refund  ..... ");
        if (isValidCurrency(currency) && isValidAmount(amount)){
            System.out.println("Refund completed");
            return true;
        }
        return false;
    }

    static double currencyConverter(double amount,String currency){
        return switch (currency){
            case "USD" ->amount * 0.90;
            case "BP" ->amount * 1.10;
            default -> throw new IllegalArgumentException("Invalid currency - " + currency);
        };
    }

    private boolean isValidCurrency(String currency){
        return currency.equals(BASE_CURRENCY);
    }

    private boolean isValidAmount(double amount){
        return amount > 0 && amount < MAX_TRANSACTION_LIMIT;
    }
}
