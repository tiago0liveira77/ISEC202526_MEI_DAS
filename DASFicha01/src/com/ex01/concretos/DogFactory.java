package com.ex01.concretos;

import com.ex01.fabrica.AnimalFactory;
import com.ex01.interfaces.Animal;

public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        System.out.println("A dog is created");
        return new Dog();
    }
}
