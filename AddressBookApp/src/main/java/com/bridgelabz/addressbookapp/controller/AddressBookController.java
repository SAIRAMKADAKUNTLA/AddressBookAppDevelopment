package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,new AddressBookDTO("sai","ram"
        ,23,"hyderabad","Telangana",5764893,7963256));
        ResponseDTO responseDTO=new ResponseDTO("get call sucess",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("id") int id){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,new AddressBookDTO("sai","ram"
                ,23,"hyderabad","Telangana",5764893,7963256));
        ResponseDTO responseDTO=new ResponseDTO("get call for id success"+id,addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public  ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Successfully",addressBookData);
        return new  ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @PutMapping("/update")
    public  ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData=new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated Successfully",addressBookData);
        return new  ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id){
        ResponseDTO responseDTO=new ResponseDTO("deleted Successfully","deleted id is : "+id);
        return new  ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
}
