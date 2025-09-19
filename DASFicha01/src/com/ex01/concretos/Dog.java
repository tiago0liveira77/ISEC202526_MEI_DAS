package com.ex01.concretos;


import com.ex01.interfaces.Animal;

public class Dog implements Animal {
    @Override
    public void displayBehavior() {
        System.out.println("It says: Bow-Wow\nIt prefers barking");
    }
}
