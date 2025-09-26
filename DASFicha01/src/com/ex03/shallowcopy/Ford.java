package com.ex03.shallowcopy;

public class Ford extends BasicCar{

    // Construtor: Usado apenas para criar o protótipo original
    public Ford(String modelIdentifier) {
        System.out.println("Criando um Ford do zero...");
        this.modelName = "Ford " + modelIdentifier;
        this.price = 30000;
    }

    @Override
    public void setModelName(String name) {
        this.modelName = name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }
}
