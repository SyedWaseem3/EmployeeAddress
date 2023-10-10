package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    //Get all address
    @GetMapping("getAllAddress")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    //Get an address by id
    @GetMapping("getAddressById/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    //Create a new address
    @PostMapping("addAddress")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }

    //Update an address by id
    @PutMapping("updateAddressById/{id}/zipCode/{newZipCode}")
    public String updateAddressById(@PathVariable Long id, @PathVariable String newZipCode){
        return addressService.updateAddressById(id, newZipCode);
    }

    //Delete an address by id
    @DeleteMapping("deleteAddressById/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }

}
