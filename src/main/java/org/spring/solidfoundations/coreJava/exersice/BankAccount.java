package org.spring.solidfoundations.coreJava.exersice;

import java.util.Objects;

public final class BankAccount {
    private final String accountNumber;
    private double balance;

    private static int counter;

    public BankAccount(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isBlank()) throw new IllegalArgumentException("invalid argument");
        this.accountNumber = accountNumber;
        setBalance(balance);
        counter++;
    }

    public void deposit(double amount){
        if (amount <= 0) throw new IllegalArgumentException("deposit amount can not be negative");
        setBalance(this.balance + amount);
    }

    public void withdraw(double amount){
        if (amount > balance || amount <= 0) throw new IllegalArgumentException("Invalid amount");
        balance -= amount;
    }

    @Override
    public boolean equals(Object o) {
        if (o==this) return true;
        if (!(o instanceof BankAccount that)) return false;
        return Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accountNumber);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }

    private void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("balance can not be less than zero");
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getCounter() {
        return counter;
    }
}
