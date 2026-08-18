package org.spring.solidfoundations.coreJava.oop.constructor.supers;

public class Child extends Parent{
    private final String lastName;

    public Child(String name) {
        this(name, "Jr");
    }

    public Child(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }
}
