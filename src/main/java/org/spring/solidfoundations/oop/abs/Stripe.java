package org.spring.solidfoundations.oop.abs;

public class Stripe implements PaymentProcessor, RefundPaymentProcessor{

    // apply custom implementation for all methods
    @Override
    public PaymentStatus getStatus(String paymentId) {
        return null;
    }

    @Override
    public RefundResult refund(String paymentId) {
        return null;
    }

    @Override
    public PaymentResult process(PaymentRequest request) {
        return null;
    }
}
