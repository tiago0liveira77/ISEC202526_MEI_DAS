package com.ex02.concretos;

public class WildTiger extends Animal implements Tiger {
    public WildTiger(String color) {
        super(color);
    }
    @Override
    public void aboutMe() {
        System.out.println("I prefer hunting in jungles.Roar.\nI saw a wild dog in the jungle.\n");
    }
}