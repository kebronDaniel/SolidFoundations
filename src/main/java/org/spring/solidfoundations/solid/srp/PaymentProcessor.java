package org.spring.solidfoundations.solid.srp;

import org.spring.solidfoundations.oop.abs.PaymentRequest;
import org.spring.solidfoundations.oop.abs.PaymentResult;

public interface PaymentProcessor {
    PaymentResult makePayment(PaymentRequest request);
}
