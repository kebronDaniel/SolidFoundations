package org.spring.solidfoundations.coreJava;

public class RandD {

    public static void change(Person p){
        p = new Person("new person");
        System.out.println(p.getName());

        // p holds the copy of the reference thus it simply changes the reference to a new one.
    }
}
