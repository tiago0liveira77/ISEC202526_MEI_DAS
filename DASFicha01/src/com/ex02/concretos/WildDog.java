package com.ex02.concretos;

public class WildDog extends Animal implements Dog {
    public WildDog(String color) {
        super(color);
    }
    @Override
    public void displayMe() {
        System.out.println("I prefer to roam freely in jungles.Bow-Wow.");
    }
}