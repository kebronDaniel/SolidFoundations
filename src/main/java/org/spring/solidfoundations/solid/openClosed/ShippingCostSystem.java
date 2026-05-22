package org.spring.solidfoundations.solid.openClosed;

public class ShippingCostSystem {
    private final ShippingServiceRegistry serviceRegistry;

    public ShippingCostSystem(ShippingServiceRegistry serviceRegistry) {
        this.serviceRegistry = serviceRegistry;
    }

    public void ship(){
        // you can define what to send and pick a service the send
    }
}
