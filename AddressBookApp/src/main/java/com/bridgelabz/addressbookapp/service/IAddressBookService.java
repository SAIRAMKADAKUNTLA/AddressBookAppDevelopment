package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;
import java.util.Optional;

public interface IAddressBookService {
    List<AddressBookData> getData();

    AddressBookData getDataById(int id);

    AddressBookData addData(AddressBookDTO addressBookDTO);

    AddressBookData updateData(int id,AddressBookDTO addressBookDTO);

    void deleteData(int id);
    List<AddressBookData> getByAge(int age);
    List<AddressBookData> getByName(String name);
    List<AddressBookData> getByCity(String city);
    List<AddressBookData> getByState(String state);
    List<AddressBookData> getByZipcode(long zipcode);
    List<AddressBookData> getByPhone_number(long phone_number);
    List<AddressBookData> getSortByName();
}
