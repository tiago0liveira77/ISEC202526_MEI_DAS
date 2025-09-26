package com.ex04;

public class FordBuilder implements VehicleBuilderI {

   private Ford ford = new Ford();

    public FordBuilder() {
        super(); // Instancia o produto no início
    }

    @Override
    public VehicleBuilderI setModelDetails(String modelName, float price) {
        // O Builder armazena os dados passados pelo cliente/Diretor
        ford.modelName = modelName;
        ford.price = price;
        return this;
    }

    @Override
    public VehicleBuilderI buildBody() {
        System.out.println("\tMaking the car body.");
        return this;
    }

    @Override
    public VehicleBuilderI insertWheels() {
        System.out.println("\t4 wheels are added to the car.");
        return this;
    }

    @Override
    public VehicleBuilderI addBrandName(String brand) {
        System.out.println("\tAdding the car brand: " + brand);
        return this;
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("-> Construção do Ford completa.");
        return new Ford(ford.modelName, ford.price);
    }
}