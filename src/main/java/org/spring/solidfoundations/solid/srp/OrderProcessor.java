package org.spring.solidfoundations.solid.srp;

public interface OrderProcessor {
    // define the input and output like order as input
    void ValidateCart();
    Double calculateTotal(); // input is order class
    void applyDiscounts(); // order items can be an input
    void saveOrder(); // order is the input class
}
