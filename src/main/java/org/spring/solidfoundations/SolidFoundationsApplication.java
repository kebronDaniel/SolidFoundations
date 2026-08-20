package org.spring.solidfoundations;

import org.spring.solidfoundations.coreJava.collections.Train;
import org.spring.solidfoundations.coreJava.equalsAndHash.Office;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SolidFoundationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidFoundationsApplication.class, args);

        Set<Train> trainSet = new TreeSet<>(
                // Hashset accepts the Comparator interface as an arg
                // the interface is a functional one (with only one method)
                // the two (comparing and thenComparingInt) are used to do both sorting and comparing.
                // sort by name and compare if the same, then move to compare by Id.
                Comparator.comparing(Train::getName).thenComparingInt(Train::getId)
        );

        trainSet.add(new Train("ICE",3));
        trainSet.add(new Train("ICE",4));
        System.out.println(trainSet.size());
    }

}
