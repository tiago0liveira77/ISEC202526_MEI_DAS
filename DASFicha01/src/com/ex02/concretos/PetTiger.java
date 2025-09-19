package com.ex02.concretos;

public class PetTiger extends Animal implements Tiger {
    public PetTiger(String color) {
        super(color);
    }

    @Override
    public void aboutMe() {
        System.out.println("Halum. I play in an animal circus.\\nI saw a pet dog in my town.\"");
    }
}