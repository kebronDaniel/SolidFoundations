package org.spring.solidfoundations.solid.dip;

public class ReportingPlatform {
    // the inputs and output classes are not defined in the interfaces.
    // can add related behaviors in their respective interfaces.
    private final ReportService reportService;
    private final StorageService storageService;
    private final DeliveryService deliveryService;

    public ReportingPlatform(ReportService reportService, StorageService storageService, DeliveryService deliveryService) {
        this.reportService = reportService;
        this.storageService = storageService;
        this.deliveryService = deliveryService;
    }
}
