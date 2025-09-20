package com.ex021.family;

import com.ex021.interfaces.Moto;

public class FamilyMoto implements Moto {
    private String model;
    private boolean hasSidecar;

    public FamilyMoto(String model, boolean hasSidecar) {
        this.model = model;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void accelerate() {
        System.out.println("A mota familiar acelera calmamente.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Modelo: " + model + ", Tem Sidecar: " + hasSidecar + ".");
    }
}
