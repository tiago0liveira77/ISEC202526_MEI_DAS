package com.ex02.fabrica;

import com.ex02.concretos.dog.Dog;
import com.ex02.concretos.tiger.Tiger;

public interface AnimalFactory {
    Dog createDog(String color);
    Tiger createTiger(String color);
}
