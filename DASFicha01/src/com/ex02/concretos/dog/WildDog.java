package com.ex02.concretos.dog;

import com.ex02.concretos.Animal;

public class WildDog extends Animal implements Dog {
    public WildDog(String color) {
        super(color);
    }
    @Override
    public void displayMe() {
        System.out.println("I prefer to roam freely in jungles.Bow-Wow.");
    }
}