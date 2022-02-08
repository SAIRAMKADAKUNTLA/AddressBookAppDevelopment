package com.bridgelabz.addressbookapp.dto;



public class AddressBookDTO {
    public String first_name;
    public String last_name;
    public int age;
    public String city;
    public String state;
    public long zipcode;
    public long phone_number;

    public AddressBookDTO(String first_name, String last_name, int age, String city, String state, long zipcode, long phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", phone_number=" + phone_number +
                '}';
    }
}

