package org.spring.solidfoundations.coreJava.oop.staticCounter;

public class User {
    // this can be used as how many instances are created in total.
    private static int counter;

    // this can be used to assign instances there sequence as an Id
    private final int id;

    public User() {
        counter++;
        this.id = counter;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }
}
