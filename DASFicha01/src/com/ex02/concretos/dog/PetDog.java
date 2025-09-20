package com.ex02.concretos.dog;

import com.ex02.concretos.Animal;

public class PetDog extends Animal implements Dog {
    public PetDog(String color) {
        super(color);
    }

    @Override
    public void displayMe() {
        System.out.println("Bow-Wow. I prefer to stay at home.");
    }
}