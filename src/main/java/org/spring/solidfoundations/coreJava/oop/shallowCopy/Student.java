package org.spring.solidfoundations.coreJava.oop.shallowCopy;

import java.util.List;

public class Student {
    private final String name;
    private final List<String> subjects;

    public Student(String name, List<String> subjects) {
        this.name = name;
        // since it only copies the references of the elements and it also returns immutable List
        // it can be safe.
        // If you had a list of mutable objects—like List<Exam> where Exam has a setScore()
        // method—a shallow copy would still leave a vulnerability:
        this.subjects = List.copyOf(subjects);
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}
