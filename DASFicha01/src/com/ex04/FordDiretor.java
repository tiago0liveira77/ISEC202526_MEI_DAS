package com.ex04;

public class FordDiretor extends Diretor {

    public FordDiretor(VehicleBuilderI builder) {

        super(builder);
    }

    @Override
    public Vehicle instruct(String brand) {
        System.out.println("These are the construction sequences:");
        return this.builder
                    .setModelDetails(brand, 50)
                    .buildBody()
                    .insertWheels()
                    .addBrandName(brand)
                    .getVehicle();
    }
}
