package com.ex02.fabrica;

import com.ex02.concretos.Dog;
import com.ex02.concretos.Tiger;
import com.ex02.concretos.WildDog;
import com.ex02.concretos.WildTiger;

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
