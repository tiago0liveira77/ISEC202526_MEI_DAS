package com.ex021.executive;

import com.ex021.interfaces.Car;

public class ExecutiveCar implements Car {
    private String model;
    private boolean isArmored;

    public ExecutiveCar(String model, boolean isArmored) {
        this.model = model;
        this.isArmored = isArmored;
    }

    @Override
    public void accelerate() {
        System.out.println("O carro executivo acelera com a máxima elegância e discrição.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Modelo: " + model + ", Blindado: " + isArmored + ".");
    }
}
