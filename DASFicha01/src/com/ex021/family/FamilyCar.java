package com.ex021.family;

import com.ex021.interfaces.Car;

public class FamilyCar implements Car {
    private String model;
    private int numSeats;

    public FamilyCar(String model, int numSeats) {
        this.model = model;
        this.numSeats = numSeats;
    }

    @Override
    public void accelerate() {
        System.out.println("O carro familiar acelera suavemente.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Modelo: " + model + ", Lugares: " + numSeats + ".");
    }
}