package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookRepo extends JpaRepository<AddressBookData,Integer> {

    @Query(value = "select * from details where  age >=:age",nativeQuery = true)
    List<AddressBookData> findByAge(int age);

    @Query(value = "select * from details where  name =:name",nativeQuery = true)
    List<AddressBookData> findByName(String name);

    @Query(value = "select * from details where  city =:city",nativeQuery = true)
    List<AddressBookData> findByCity(String city);

    @Query(value = "select * from details where  state =:state",nativeQuery = true)
    List<AddressBookData> findByState(String state);

    @Query(value = "select * from details where  zipcode =:zipcode",nativeQuery = true)
    List<AddressBookData> findByZipcode(long zipcode);

    @Query(value = "select * from details where  phone_number =:phone_number",nativeQuery = true)
    List<AddressBookData> findByPhone(long phone_number);

    @Query(value = "select * from details order by name",nativeQuery = true)
    List<AddressBookData> sortByName();




}
