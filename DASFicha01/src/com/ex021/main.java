package com.ex021;

import com.ex021.family.FamilyVehicleFactory;
import com.ex021.interfaces.AbstractVehicleFactory;
import com.ex021.interfaces.Car;
import com.ex021.interfaces.Moto;
import com.ex021.sport.SportVehicleFactory;

import static com.ex021.provider.VehicleFactoryProvider.getFactory;

public class main {
    public static void main(String[] args) {
        //V1
        sportStuff();
        familyStuff();

        //V2 - Implementar executiveStuff
        executiveStuff();

    }

    public static void sportStuff(){
        System.out.println("--- Criando veículos desportivos ---");
        AbstractVehicleFactory sportFactory = getFactory("sport");
        Car sportCar = sportFactory.createCar();
        Moto sportMotorcycle = sportFactory.createMoto();

        sportCar.displayInfo();
        sportCar.accelerate();
        sportMotorcycle.displayInfo();
        sportMotorcycle.accelerate();
    }

    public static void familyStuff(){
        System.out.println("\n--- Criando veículos familiares ---");
        AbstractVehicleFactory familyFactory = getFactory("family");
        Car familyCar = familyFactory.createCar();
        Moto familyMotorcycle = familyFactory.createMoto();

        familyCar.displayInfo();
        familyCar.accelerate();
        familyMotorcycle.displayInfo();
        familyMotorcycle.accelerate();
    }

    //V2
    public static void executiveStuff(){

    }
}
