package com.ex02.fabrica;

import com.ex02.concretos.Dog;
import com.ex02.concretos.PetDog;
import com.ex02.concretos.PetTiger;
import com.ex02.concretos.Tiger;

public class PetAnimalFactory implements AnimalFactory {
    @Override
    public Dog createDog(String color) {
        System.out.println("A pet " + color + "dog with black color is created.");
        return new PetDog(color);
    }

    @Override
    public Tiger createTiger(String color) {
        System.out.println("A pet tiger with " + color + " color is created.");
        return new PetTiger(color);
    }
}