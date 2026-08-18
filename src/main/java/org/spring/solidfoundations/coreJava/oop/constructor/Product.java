package org.spring.solidfoundations.coreJava.oop.constructor;

public class Product {
    private final String name;
    private final String type;

    public Product(String name) {
        // use the second constructor to generate.
        this(name,"default type");
    }

    public Product(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
