package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "details")
public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String first_name;
    private String last_name;
    private int age;
    private String city;
    private String state;
    private long zipcode;
    private long phone_number;
     public  AddressBookData(){

     }

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateDetails(addressBookDTO);
    }
    public void updateDetails(AddressBookDTO addressBookDTO){
        this.first_name = addressBookDTO.first_name;
        this.last_name = addressBookDTO.last_name;
        this.age = addressBookDTO.age;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zipcode = addressBookDTO.zipcode;
        this.phone_number = addressBookDTO.phone_number;
    }

}
