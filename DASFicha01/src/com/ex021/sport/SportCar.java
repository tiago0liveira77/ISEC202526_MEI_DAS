package com.ex021.sport;

import com.ex021.interfaces.Car;

public class SportCar implements Car {
    private String model;
    private int horsePower;

    public SportCar(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public void accelerate() {
        System.out.println("O carro desportivo acelera com potência!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Modelo: " + model + ", Potência: " + horsePower + " HP.");
    }
}
