package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AddressBookService implements  IAddressBookService{

    private List<AddressBookData> addressBookData=new ArrayList<>();

    @Autowired
    AddressBookRepo addressBookRepo;


    @Override
    public List<AddressBookData> getData() {
        return  addressBookRepo.findAll();
    }

    @Override
    public AddressBookData getDataById(int id) {
        return addressBookRepo.findById(id).orElseThrow(() ->new AddressBookException("data not found"));
    }

    @Override
    public AddressBookData addData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(addressBookDTO);
        log.debug("data is : "+addressBookData.toString());
        return  addressBookRepo.save(addressBookData);
    }

    @Override
    public AddressBookData updateData(int id,AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=this.getDataById(id);
        addressBookData.updateDetails(addressBookDTO);
        return addressBookRepo.save(addressBookData);
    }

    @Override
    public void deleteData(int id) {
       AddressBookData addressBookData=this.getDataById(id);
       addressBookRepo.delete(addressBookData);
    }
}
