package org.spring.solidfoundations.oop.abs;

public interface RefundPaymentProcessor {
    // it's better to have multiple interfaces than having one and enforcing other to implement all the methods.
    RefundResult refund(String paymentId);
}
