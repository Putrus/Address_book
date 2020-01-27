package com.jetbrains;

public class Person {
    private String name;
    private String surname;
    private String phone_number;
    private Address address;
    public Person(String name, String surname, String phone_number, String street, String nr_house, String nr_flat, String post_code, String post_office)
    {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.address = new Address(street, nr_house, nr_flat, post_code, post_office);
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPhone_number() {
        return this.phone_number;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
