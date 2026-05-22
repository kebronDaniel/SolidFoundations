package org.spring.solidfoundations.oop.abs;

import java.math.BigDecimal;

public class PaymentRequest {
    private final String debtAccount;
    private final String creditAccount;
    private final BigDecimal transferAmount;

    public PaymentRequest(String debtAccount, String creditAccount, BigDecimal transferAmount) {
        this.debtAccount = debtAccount;
        this.creditAccount = creditAccount;
        this.transferAmount = transferAmount;
    }
}
