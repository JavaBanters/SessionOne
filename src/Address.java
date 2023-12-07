public class Address {

    public String houseNumber;

    public String streetNumber;

    public int pincode;


    public Address () {

    }


    public Address (String houseNumber, String streetNumber, int pincode) {

        this.houseNumber = houseNumber;
        this.streetNumber = streetNumber;
        this.pincode = pincode;

    }



    public static void main(String[] args) {

        Address a = new Address(); // default constructor
        a.pincode = 123;
        System.out.println(a.pincode);

        Address b = new Address("456", "42", 732101); //parameterized constructors
        System.out.println(b.houseNumber);

    }

}
