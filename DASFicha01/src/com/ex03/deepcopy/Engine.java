package com.ex03.deepcopy;

// Engine.java
public class Engine implements Cloneable {
    private int horsepower; // Mutável

    public Engine(int hp) {
        this.horsepower = hp;
    }

    // Método para provar a mutabilidade
    public void upgrade(int boost) {
        this.horsepower += boost;
    }

    public int getHorsepower() {
        return horsepower;
    }

    // Implementação da Deep Copy para o Engine:
    // Uma cópia rasa é suficiente aqui, pois Engine só tem tipos primitivos (int)
    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    @Override
    public String toString() {
        return "Engine{" + horsepower + " HP}";
    }
}
