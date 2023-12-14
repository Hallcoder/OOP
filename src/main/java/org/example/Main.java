package org.example;

import org.example.inheritance.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
//    public static void main(String[] args) {
//        Initializers i = new Initializers();
//        Student s1 = new Student();
//        System.out.println("Hello world!");
//        Timer t   = new Timer(1000,new Listen());
//        t.start();
//    }

    class Listen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Tick ... Tock");
        }
    }
}