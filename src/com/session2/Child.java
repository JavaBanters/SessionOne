package com.session2;

public class Child extends Parent{ // SubClass

    Child() {
        System.out.println("Child Constructor is called");
    }

    Child(int a ) {
        super(a);
        System.out.println("Child is called "+ a);
    }

    void printSomething() {
        System.out.println("From Child Class");
    }

}
