package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.oop.staticMembers.ChildEmployee;
import org.spring.solidfoundations.coreJava.oop.staticMembers.Employee;
import org.spring.solidfoundations.coreJava.oop.staticMembers.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidFoundationsApplication.class, args);

        Employee employee = new Employee("first employee");

        // here the parents static method overrides the child's(one static member per class)
        // because its the declared type that is taken.
        // its called method hiding.
        Employee employee2 = new ChildEmployee("second employee");

        Employee.show(employee);
        ChildEmployee.show(employee2);

    }

}
