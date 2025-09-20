package com.ex021.executive;

import com.ex021.interfaces.Moto;

public class ExecutiveMoto implements Moto {
    private String model;
    private int numCylinders;

    public ExecutiveMoto(String model, int numCylinders) {
        this.model = model;
        this.numCylinders = numCylinders;
    }

    @Override
    public void accelerate() {
        System.out.println("A mota executiva acelera de forma silenciosa e poderosa.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Modelo: " + model + ", Cilindros: " + numCylinders + ".");
    }
}
