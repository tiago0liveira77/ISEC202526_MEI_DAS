package com.ex02;

import com.ex02.concretos.dog.Dog;
import com.ex02.concretos.tiger.Tiger;
import com.ex02.fabrica.AnimalFactory;
import com.ex02.fabrica.WildAnimalFactory;
import com.ex02.provider.FactoryProvider;

public class ex02 {
    public static void main(String[] args) {
        AnimalFactory animalFactory1;
        animalFactory1 = new WildAnimalFactory();
        Dog dog1 = animalFactory1.createDog("white");
        Tiger tiger1 = animalFactory1.createTiger("golden");
        dog1.displayMe();
        tiger1.aboutMe();

        AnimalFactory animalFactory2;
        animalFactory2 = FactoryProvider.getFactory("wild");
        Dog dog2 = animalFactory2.createDog("white");
        Tiger tiger2 = animalFactory2.createTiger("golden");
        dog2.displayMe();
        tiger2.aboutMe();
    }
}
