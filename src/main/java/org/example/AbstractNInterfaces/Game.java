package org.example.AbstractNInterfaces;

public class Game implements  Playable{
    @Override
    public void play() {
        System.out.println("This works kbs I can see");
    }
    public static void main(String[] args){
        System.out.println("Hello from Game main.. 👋👋");
    }
}
