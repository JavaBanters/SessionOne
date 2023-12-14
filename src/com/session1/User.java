package com.session1;

import java.util.Date;

public class User {

    public String firstName ;

    public String surName;

    public int mobileNumber;

    public Date dob;

    public String gender;

    public String password;

    public Address address;

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.houseNumber = "120";
        address1.pincode = 734203;


        User anant = new User(); //constuctor
        anant.firstName = "adasd";
        anant.surName = "ruud";
        anant.mobileNumber = 2147483647;
        anant.address = address1;
        anant.dob = new Date();

        System.out.println(anant.dob);

//
//        com.session1.User dolker = new com.session1.User();
//        dolker.firstName = "Dolker";
//        dolker.surName = "dol";



    }

}
