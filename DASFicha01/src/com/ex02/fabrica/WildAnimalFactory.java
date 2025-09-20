package com.ex02.fabrica;

import com.ex02.concretos.dog.Dog;
import com.ex02.concretos.tiger.Tiger;
import com.ex02.concretos.dog.WildDog;
import com.ex02.concretos.tiger.WildTiger;

public class WildAnimalFactory implements AnimalFactory {
    @Override
    public Dog createDog(String color) {
        System.out.println("A " + color + " dog with white color is created.");
        return new WildDog(color);
    }

    @Override
    public Tiger createTiger(String color) {
        System.out.println("A wild tiger with " + color + " and cinnamon color is created.");
        return new WildTiger(color);
    }
}
