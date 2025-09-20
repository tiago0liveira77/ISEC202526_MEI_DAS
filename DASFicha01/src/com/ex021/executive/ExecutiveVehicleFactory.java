package com.ex021.executive;

import com.ex021.interfaces.AbstractVehicleFactory;
import com.ex021.interfaces.Boat;
import com.ex021.interfaces.Car;
import com.ex021.interfaces.Moto;

public class ExecutiveVehicleFactory implements AbstractVehicleFactory {
    @Override
    public Car createCar() {
        return new ExecutiveCar("Mercedes S 550", true);
    }

    @Override
    public Moto createMoto() {
        return new ExecutiveMoto("Triumph", 4);
    }

    @Override
    public Boat createBoat() {
        return null;
    }
}
