package org.spring.solidfoundations.coreJava.oop.constructor.supers.noArgSupers;

public class Master {

    int m = initializeMaster();

    public Master() {
        print();
    }

    public void print(){
        System.out.println("Mater prints");
    }

    public int initializeMaster(){
        System.out.println("initializing master's field");
        this.m = 4;
        return this.m;
    }
}
