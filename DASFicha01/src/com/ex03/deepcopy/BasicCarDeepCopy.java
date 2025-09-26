package com.ex03.deepcopy;

// BasicCarDeepCopy.java
public class BasicCarDeepCopy implements Cloneable {

    private String color;
    private Engine engine; // O OBJETO MUTÁVEL que exige Deep Copy

    public BasicCarDeepCopy(String color, int initialHP) {
        this.color = color;
        this.engine = new Engine(initialHP);
    }

    // Getters e Setters
    public String getColor() { return color; }
    public Engine getEngine() { return engine; }
    public void setColor(String color) { this.color = color; }

    // **********************************************
    // *** A MÁGICA da Deep Copy ACONTECE AQUI! ***
    // **********************************************
    @Override
    public BasicCarDeepCopy clone() throws CloneNotSupportedException {
        // 1. Clonagem Rasa (Shallow Copy) do objeto principal (BasicCarDeepCopy)
        BasicCarDeepCopy clonedCar = (BasicCarDeepCopy) super.clone();

        // 2. Clonagem Profunda (Deep Copy) do objeto mutável (Engine)
        // Isso garante que o clone do motor seja um novo objeto, e não apenas uma referência.
        clonedCar.engine = this.engine.clone();

        return clonedCar;
    }

    @Override
    public String toString() {
        return "Carro [Cor='" + color + "', Motor=" + engine + "]";
    }
}
