package org.example.inheritance;

import java.util.Date;

public class Person {
    private int age;
    private String lastName;
    private String firstName;
    private Date dob;

    String sayHello(){
        return "Saying Hello from person,,,,";
    }
    Person(){
        System.out.println("Initialized from Student 😂");
    }
}
