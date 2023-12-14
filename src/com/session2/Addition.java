package com.session2;

public class Addition {

    int variable1 ;
    int variable2 ;

    int addition(int a , int b) {
        return a + b;
    }

    int addition(int a , int b, int c) { // method overloading
        return a + b + c;
    }

    public static void main(String[] args) {

        Addition a = new Addition();
        System.out.println(a.addition(2,3));
        System.out.println(a.addition(2,3, 4));
    }

}
