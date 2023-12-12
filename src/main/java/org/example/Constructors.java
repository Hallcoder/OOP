package org.example;

public class Constructors {
    private int number;
    private String description;
    private boolean isActive;

    //experiment with constructors
    Constructors(){}

    Constructors(int number,boolean isActive){
        this.number = number;
        this.isActive = isActive;
    }
    Constructors(int number, boolean isActive,String description){
        this(number,isActive);
        this.description = description;
    }
}
