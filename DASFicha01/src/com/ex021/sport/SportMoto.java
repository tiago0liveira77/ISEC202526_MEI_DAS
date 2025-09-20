package com.ex021.sport;

import com.ex021.interfaces.Moto;

public class SportMoto implements Moto {
    private String model;
    private int topSpeed;

    public SportMoto(String model, int topSpeed) {
        this.model = model;
        this.topSpeed = topSpeed;
    }

    @Override
    public void accelerate() {
        System.out.println("A mota desportiva arranca a alta velocidade!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Modelo: " + model + ", Velocidade Máxima: " + topSpeed + " km/h.");
    }
}
