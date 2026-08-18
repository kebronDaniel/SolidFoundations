package org.spring.solidfoundations.coreJava.oop.staticMembers;

public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public static void show(Employee employee){
        System.out.println("Employee name: "+employee.name);
    }
}
