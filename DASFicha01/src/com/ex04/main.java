package com.ex04;

public class main {
    public static void main(String[] args) {
        VehicleBuilderI builder = new FordBuilder();
        Diretor director = new FordDiretor(builder);
        Vehicle ford =director.instruct("Ford");
        System.out.println(ford.toString());
    }
}
