package com.ex021;

import com.ex021.executive.ExecutiveCar;
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
        System.out.println("\n--- Criando veículos executivos ---");
        AbstractVehicleFactory familyFactory = getFactory("executive");
        Car executiveCar = familyFactory.createCar();
        Moto executiveMotorcycle = familyFactory.createMoto();

        executiveCar.displayInfo();
        executiveCar.accelerate();
        executiveMotorcycle.displayInfo();
        executiveMotorcycle.accelerate();

        //Se for necessario alterar atributos e necessário cast
        ExecutiveCar myExecutiveCar = (ExecutiveCar) executiveCar;
        myExecutiveCar.setModel("Mercedes S 580 Hybrid");
        System.out.println("\n--|Alterar info de objeto|--");
        myExecutiveCar.displayInfo();
    }
}
