package com.ex01.fabrica;

import com.ex01.interfaces.Animal;

public abstract class AnimalFactory {
    // O Factory Method, declarado como abstrato.
    public abstract Animal createAnimal();

    // Outros métodos que a fábrica pode ter,
    // que usam o Factory Method.
    public void prepareAndDisplay() {
        Animal animal = createAnimal();
        animal.displayBehavior();
    }
}
