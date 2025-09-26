package com.ex04;

abstract class Diretor {
    protected VehicleBuilderI builder;
    public Diretor(VehicleBuilderI builder) {
        this.builder = builder;
    }
    public abstract Vehicle instruct(String brand);
}
