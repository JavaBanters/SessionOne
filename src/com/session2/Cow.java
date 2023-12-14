package com.session2;

public class Cow implements Animal{


    @Override
    public void makeSomeNoise() {
        System.out.println("Moo Moo");
    }

    @Override
    public void canItFly() {
        System.out.println("Cows connot fly");
    }


}
