package com.session2;

public class Parent { //SuperClass

    Parent() {
        System.out.println("Parent Constructor is called");
    }

    Parent(int a) {
        System.out.println("From Parent "+ a);
    }

    void printSomething() {
        System.out.println("From Parent Class");
    }

}
