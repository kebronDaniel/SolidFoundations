package org.spring.solidfoundations.coreJava.RefTypes;

public class RandD {

    public static void change(Person p){
        p = new Person("new person");
        System.out.println(p.getName());

        // p holds the copy of the reference thus it simply changes the reference to a new one.

        // Also the jvm stores a stack frame meaning a dedicated place in the stack to store all the things that the method needs.
        // this is used when this method is called.
    }
}
