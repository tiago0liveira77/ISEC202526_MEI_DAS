package com.ex01;

import com.ex01.concretos.DogFactory;
import com.ex01.fabrica.AnimalFactory;

public class Ex01 {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        dogFactory.prepareAndDisplay();
    }
}
