package org.spring.solidfoundations.oop.abs;

interface PaymentProcessor {

    // explicit domain input/output.
    // don't make the signatures weak and too general

    PaymentResult process(PaymentRequest request);

    PaymentStatus getStatus(String paymentId);
}
