package com.ex021.provider;

import com.ex021.executive.ExecutiveVehicleFactory;
import com.ex021.family.FamilyVehicleFactory;
import com.ex021.interfaces.AbstractVehicleFactory;
import com.ex021.sport.SportVehicleFactory;

public class VehicleFactoryProvider {
    public static AbstractVehicleFactory getFactory(String type) {
        if ("sport".equalsIgnoreCase(type)) {
            return new SportVehicleFactory();
        } else if ("family".equalsIgnoreCase(type)) {
            return new FamilyVehicleFactory();
        } else if ("executive".equalsIgnoreCase(type)) {
            return new ExecutiveVehicleFactory();
        }

        throw new IllegalArgumentException("Tipo de veículo inválido: " + type);
    }
}
