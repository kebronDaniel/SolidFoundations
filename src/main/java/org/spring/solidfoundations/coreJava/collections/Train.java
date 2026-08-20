package org.spring.solidfoundations.coreJava.collections;

public class Train {
    private final String name;
    private final int id;

    public Train(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
