package org.spring.solidfoundations.oop;

import java.util.ArrayList;
import java.util.List;

class Order {
    private List<OrderItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public List<OrderItem> getItems() {
        return List.copyOf(items);
    }

    public void addItem(OrderItem item) {
        // validation
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }
}
