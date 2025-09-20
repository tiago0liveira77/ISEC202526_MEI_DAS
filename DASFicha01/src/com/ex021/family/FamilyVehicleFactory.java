package com.ex021.family;

import com.ex021.interfaces.AbstractVehicleFactory;
import com.ex021.interfaces.Boat;
import com.ex021.interfaces.Car;
import com.ex021.interfaces.Moto;

public class FamilyVehicleFactory implements AbstractVehicleFactory {
    @Override
    public Car createCar() {
        return new FamilyCar("Ford Focus", 5);
    }

    @Override
    public Moto createMoto() {
        return new FamilyMoto("Harley Davidson", true);
    }

    @Override
    public Boat createBoat() {
        return null;
    }
}
