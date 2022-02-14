package com.bridgelabz.addressbookapp.dto;


import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public @ToString class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$",message = "first name name is valid")
    public String first_name;
    @Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$",message = "last name is valid")
    public String last_name;
    @NotNull(message = "age not be null")
    public int age;
    @NotNull(message = "city not be null")
    public String city;
    @NotNull(message = "state not be null")
    public String state;
    @NotNull(message = "zipcode not be null")
    public long zipcode;
    @Pattern(regexp = "^[0-9]{10}",message = "check for 10 digits")
    public long phone_number;


}

