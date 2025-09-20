package com.ex021.sport;

import com.ex021.interfaces.AbstractVehicleFactory;
import com.ex021.interfaces.Boat;
import com.ex021.interfaces.Car;
import com.ex021.interfaces.Moto;

public class SportVehicleFactory implements AbstractVehicleFactory {
    @Override
    public Car createCar() {
        return new SportCar("Porsche 911", 450);
    }

    @Override
    public Moto createMoto() {
        return new SportMoto("Kawasaki Ninja", 300);
    }

    @Override
    public Boat createBoat() {
        return new SportBoat("JetSki", 1);
    }
}
