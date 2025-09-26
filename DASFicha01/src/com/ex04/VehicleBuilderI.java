package com.ex04;

public interface VehicleBuilderI {
    VehicleBuilderI buildBody();
    VehicleBuilderI insertWheels();
    VehicleBuilderI addBrandName(String brand);

    VehicleBuilderI setModelDetails(String modelName, float price);

    Vehicle getVehicle();
}
