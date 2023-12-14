package com.session2;

public class Cat implements Animal{

    String breed ;

    String color;


    @Override
    public void makeSomeNoise() {
        System.out.println("Meow Meow");
    }

    @Override
    public void canItFly() {
        System.out.println("Cats cannot Fly");
    }


}
