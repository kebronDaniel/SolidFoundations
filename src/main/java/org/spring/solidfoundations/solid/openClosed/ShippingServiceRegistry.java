package org.spring.solidfoundations.solid.openClosed;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ShippingServiceRegistry {
    private final Map<String, ShippingService> shippingServiceHashMap = new ConcurrentHashMap<>(); // good to handle cocurrency.

    //define the keys via enums for consistency.

    private void addShippingService(String type, ShippingService service){
        if (!shippingServiceHashMap.containsKey(type)){
            shippingServiceHashMap.put(type,service);
        }
    }

    private Optional<ShippingService> resolveShippingService(String type){
        if (shippingServiceHashMap.containsKey(type)){
            return Optional.of(shippingServiceHashMap.get(type));
        }
        return Optional.empty();
    }

}
