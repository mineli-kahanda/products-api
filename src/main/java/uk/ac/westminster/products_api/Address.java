package uk.ac.westminster.products_api;

// Tutorial 2 Activity 5 — Build Customer with a Nested Address
public class Address {
    private String street;
    private String city;
    private String postcode;

    //no args constructor
    public Address(){}

    public Address(String street, String city, String postcode){
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    //getters
    public String getStreet() {return street; }
    public String getCity() {return city;}
    public String getPostcode() {return postcode;}
}
