package com.ex03.shallowcopy;

public class Nano extends BasicCar {

    // Construtor: Usado apenas para criar o protótipo original
    public Nano(String modelIdentifier) {
        // Simula o carregamento pesado
        System.out.println("Criando um Nano do zero...");
        this.modelName = "Nano " + modelIdentifier;
        this.price = 10000;
    }

    @Override
    public void setModelName(String name) {
        System.out.println("Editing a cloned model:");
        this.modelName = name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }
}