package com.session2;

public class Bird implements Animal{
    @Override
    public void makeSomeNoise() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void canItFly() {
        System.out.println("Birds can fly");
    }
}
