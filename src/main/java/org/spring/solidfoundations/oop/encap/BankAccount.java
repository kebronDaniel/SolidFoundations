package org.spring.solidfoundations.oop.encap;

import java.math.BigDecimal;

public class BankAccount {

    private BigDecimal balance;
    private AccountState state;

    public BankAccount() {
        this.balance = BigDecimal.ZERO;
        this.state = AccountState.ACTIVE;
    }

    public void withdraw(BigDecimal amount){

        if (!state.equals(AccountState.ACTIVE)){
            System.out.println("Your account is not active");
            return;
        }

        switch (amount){
            case BigDecimal amt when amt.compareTo(BigDecimal.ZERO) <= 0 -> System.out.println("Amount less than 0");
            case BigDecimal amt when amt.compareTo(balance) == 1 -> System.out.println("Amount greater than current balance");
            default -> {
                this.balance = this.balance.subtract(amount);
                System.out.println("withdraw successfully completed");
            }
        }

    }


    public void deposit(BigDecimal amount){

        if (!state.equals(AccountState.ACTIVE)){
            System.out.println("Your account is not active");
            return;
        }

        switch (amount){
            case BigDecimal amt when amt.compareTo(BigDecimal.ZERO) <= 0 -> System.out.println("Amount less than 0");
            default -> {
                // remember objects are immutable.
                this.balance = this.balance.add(amount);
                // can throw exceptions here.
                System.out.println("deposit successfully completed");
            }
        }

    }

    public void freeze(){
        // can add auth to allow certain users to change the state
        this.state = AccountState.SUSPENDED;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
