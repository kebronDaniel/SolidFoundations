package org.spring.solidfoundations.solid.srp;

public class CheckoutSystem {
    private final OrderProcessor orderProcessor;
    private final PaymentProcessor paymentProcessor;
    private final InvoiceGenerator invoiceGenerator;
    private final NotificationService notificationService;

    public CheckoutSystem(OrderProcessor orderProcessor, PaymentProcessor paymentProcessor, InvoiceGenerator invoiceGenerator, NotificationService notificationService) {
        this.orderProcessor = orderProcessor;
        this.paymentProcessor = paymentProcessor;
        this.invoiceGenerator = invoiceGenerator;
        this.notificationService = notificationService;
    }
}
