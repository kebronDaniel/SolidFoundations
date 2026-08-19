package org.spring.solidfoundations.coreJava.equalsAndHash;

import java.util.Objects;

public class Office {
    private final String name;
    private final int area;

    public Office(String name, int area) {
        this.name = name;
        this.area = area;
    }

    // assume that we only use the name for the equals.
    // in principle what you use for equals should be used for hashcode because if two are equal then there hashcode is same.
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Office office)) return false;
        return Objects.equals(name, office.name);
    }


}
