package com.ex02.fabrica;

import com.ex02.concretos.Dog;
import com.ex02.concretos.Tiger;

public interface AnimalFactory {
    Dog createDog(String color);
    Tiger createTiger(String color);
}
