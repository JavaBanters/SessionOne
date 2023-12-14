package com.session2;

public class Dog implements Animal {

    String breed;

    String color;


    public void makeSomeNoise() {
        System.out.println("Bark Bark");
    }

    @Override
    public void canItFly() {
        System.out.println("Dogs cannot fly");
    }

}
