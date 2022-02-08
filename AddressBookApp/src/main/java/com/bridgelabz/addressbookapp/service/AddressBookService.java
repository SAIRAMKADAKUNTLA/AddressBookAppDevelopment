package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements  IAddressBookService{

    private List<AddressBookData> addressBookData=new ArrayList<>();


    @Override
    public List<AddressBookData> getData() {
        return  addressBookData;
    }

    @Override
    public AddressBookData getDataById(int id) {
        return addressBookData.get(id-1);
    }

    @Override
    public AddressBookData addData(AddressBookDTO addressBookDTO) {
        AddressBookData bookData=null;
        bookData=new AddressBookData(addressBookData.size()+1,addressBookDTO);
        return bookData;
    }

    @Override
    public AddressBookData updateData(int id,AddressBookDTO addressBookDTO) {
        AddressBookData bookData=this.getDataById(id);
        bookData.setFirst_name(addressBookDTO.first_name);
        bookData.setLast_name(addressBookDTO.last_name);
        bookData.setAge(addressBookDTO.age);
        bookData.setCity(addressBookDTO.city);
        bookData.setState(addressBookDTO.state);
        bookData.setZipcode(addressBookDTO.zipcode);
        bookData.setPhone_number(addressBookDTO.phone_number);
        addressBookData.set(id-1,bookData);
        return bookData;
    }

    @Override
    public void deleteData(int id) {
        addressBookData.remove(id-1);

    }
}
