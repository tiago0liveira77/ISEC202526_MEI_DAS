package com.ex021.sport;

import com.ex021.interfaces.Boat;

public class SportBoat implements Boat {
    private String model;
    private int numberOfEngines;

    public SportBoat(String model, int numberOfEngines) {
        this.model = model;
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void navigate() {
        System.out.println("O barco desportivo navega a toda a velocidade sobre as ondas!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Modelo: " + model + ", Número de Motores: " + numberOfEngines + ".");
    }
}
