package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService service;

    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        List<AddressBookData> addressBookData=service.getData();
        ResponseDTO responseDTO=new ResponseDTO("get call success",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("id") int id){
        AddressBookData addressBookData=service.getDataById(id);
        ResponseDTO responseDTO=new ResponseDTO("get call for id success"+id,addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public  ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData=service.addData(addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Successfully",addressBookData);
        return new  ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public  ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("id")int id,@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=null;
        addressBookData=service.updateData(id,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated Successfully",addressBookData);
        return new  ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id){
        service.deleteData(id);
        ResponseDTO responseDTO=new ResponseDTO("deleted Successfully","deleted id is : "+id);
        return new  ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/age/{age}")
    public ResponseEntity<ResponseDTO> getDataByAge(@PathVariable("age") int age){
        List<AddressBookData> addressBookData=null;
        addressBookData=service.getByAge(age);
        ResponseDTO responseDTO=new ResponseDTO("get call from age ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }
    @GetMapping("/get/name/{name}")
    public ResponseEntity<ResponseDTO> getDataByName(@PathVariable("name") String name){
        List<AddressBookData> addressBookData=null;
        addressBookData=service.getByName(name);
        ResponseDTO responseDTO=new ResponseDTO("get call from name ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);

    }
    @GetMapping("/get/city/{city}")
    public ResponseEntity<ResponseDTO> getDataByCity(@PathVariable("city") String city){
        List<AddressBookData> addressBookData=null;
        addressBookData=service.getByCity(city);
        ResponseDTO responseDTO=new ResponseDTO("get call from city ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/state/{state}")
    public ResponseEntity<ResponseDTO> getDataByState(@PathVariable("state") String state){
        List<AddressBookData> addressBookData=null;
        addressBookData=service.getByState(state);
        ResponseDTO responseDTO=new ResponseDTO("get call from state ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/zipcode/{zipcode}")
    public ResponseEntity<ResponseDTO> getDataByZipcode(@PathVariable("zipcode") long zipcode){
        List<AddressBookData> addressBookData=null;
        addressBookData=service.getByZipcode(zipcode);
        ResponseDTO responseDTO=new ResponseDTO("get call from zipcode ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/p_no/{p_no}")
    public ResponseEntity<ResponseDTO> getDataByPhone_number(@PathVariable("p_no") long p_no){
        List<AddressBookData> addressBookData=null;
        addressBookData=service.getByPhone_number(p_no);
        ResponseDTO responseDTO=new ResponseDTO("get call from phone number ",addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
    @GetMapping("/get/sort")
    public  ResponseEntity<ResponseDTO> getSortDataByName(){
        List<AddressBookData> addressBookData=null;
        addressBookData=service.getSortByName();
        ResponseDTO responseDTO=new ResponseDTO("get call for sorting",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }
}
