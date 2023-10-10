package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).get();
    }

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return newAddress.getAddressId() + "'s address added!";
    }

    public String updateAddressById(Long id, String newZipCode) {
        Address newAddress = addressRepo.findById(id).get();
        newAddress.setAddressZipCode(newZipCode);
        addressRepo.save(newAddress);
        return id + "'s new zip code has been updated!";
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return id+"'s address has been deleted!";
    }
}
