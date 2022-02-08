package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getData();

    AddressBookData getDataById(int id);

    AddressBookData addData(AddressBookDTO addressBookDTO);

    AddressBookData updateData(int id,AddressBookDTO addressBookDTO);

    void deleteData(int id);
}
