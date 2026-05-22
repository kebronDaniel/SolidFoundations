package org.spring.solidfoundations.solid.openClosed;

public interface ShippingService {
    String shippingType();
    void handleShipment(); // define the input and output domains.
    // the following can be the implementation
    //standard shipping,
    //express shipping,
    //international shipping.
    //drone delivery,
    //same-day shipping,
    //partner courier pricing.
}
