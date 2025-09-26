package com.ex03.shallowcopy;

public abstract class BasicCar implements Cloneable{
    String modelName;
    float price;

    public abstract void setModelName(String name);

    public String getModelName(){
        return modelName;
    }

    public abstract void setPrice(float price);

    public float getPrice(){
        return price;
    }

    public BasicCar clone() throws  CloneNotSupportedException {
        // Por padrão, a implementação nativa de clone() faz uma cópia superficial (shallow copy).
        // Se a classe contiver objetos mutáveis (não é o caso aqui com String/int),
        // seria necessário fazer uma cópia profunda (deep copy) aqui.
        return (BasicCar) super.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("Model: ").append(modelName).append("\n");
        sb.append("Price: ").append(price).append("\n");
        sb.append("-------");
        return sb.toString();
    }
}
