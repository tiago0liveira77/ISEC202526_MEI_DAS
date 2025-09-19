package com.ex02.provider;

import com.ex02.fabrica.AnimalFactory;
import com.ex02.fabrica.PetAnimalFactory;
import com.ex02.fabrica.WildAnimalFactory;

public class FactoryProvider {

    // Este é o método que retorna a fábrica correta
    public static AnimalFactory getFactory(String tipo) {
        if ("pet".equalsIgnoreCase(tipo)) {
            return new PetAnimalFactory();
        } else if ("wild".equalsIgnoreCase(tipo)) {
            return new WildAnimalFactory();
        }

        throw new IllegalArgumentException("Tipo de fábrica inválido: " + tipo);
    }
}