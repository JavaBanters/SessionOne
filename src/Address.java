
/*

    This is an example comment. We are trying to learn Class and Object concepts

 */




public class Address {

    public String houseNumber;

    public String streetNumber;

    public int pincode; //this is a commit



    void printDetail(Address obj) {
        System.out.println("Details:::  " +obj.houseNumber+ "  " + obj.streetNumber + "  " + obj.pincode);
    }

    /*
        1. Default Constructor
        This constructor provides a default value to all the variables
         */
    Address() {
        houseNumber = "100";
        streetNumber = "25 B";
        pincode = 100000;
    }

    /*
    Parametarized constructor
     */
    Address(String arg1, String arg2, int arg3) {
        houseNumber = arg1;
        streetNumber = arg2;
        pincode = arg3;
    }

    /*
    Copy Constructor
     */
    Address(Address obj) {
        houseNumber = obj.houseNumber;
        streetNumber = obj.streetNumber;
        pincode = obj.pincode;
    }

    public static void main(String[] args) {

        Address user1 = new Address("58A" , "13 Browning Street", 734203); //creation of object //default constructor //object
        //user1.printDetail(user1);


        Address user2 = new Address();
        user2.houseNumber = "60A";
        user2.streetNumber = "16 Browing Street";
        user2.pincode = 734203;

        Address user3 = new Address();
        user3.printDetail(user3);



    }

}
