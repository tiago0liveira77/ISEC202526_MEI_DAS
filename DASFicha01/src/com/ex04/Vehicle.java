package com.ex04;

public abstract class Vehicle {
    String modelName;
    float price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vehicle{");
        sb.append("modelName='").append(modelName).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
