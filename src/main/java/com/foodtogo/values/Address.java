package com.foodtogo.values;


public class Address {

    private String street;
    private String number;
    private String city;
    private String state;
    private String zipcode;

    public Address(String street, String number, String city, String state, String zipcode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Address() {
    }
}
