package org.spring.solidfoundations.coreJava.oop.staticMembers;

public class ChildEmployee extends Employee{

    private final String name;

    public ChildEmployee(String name) {
        super(name);
        this.name = name;
    }

    public static void show(ChildEmployee childEmployee){
        System.out.println("child employee name: " + childEmployee.name);
    }

}
