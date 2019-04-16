package com.CarRental.controller;

import com.CarRental.domain.Address;
import com.CarRental.domain.Admin;
import com.CarRental.factories.AddressFactory;
import com.CarRental.factories.AddressFactory;
import com.CarRental.factories.AdminFactory;
import com.CarRental.services.Impl.AddressServiceImpl;


import java.util.List;


public class AddressController {


    private AddressServiceImpl addressService;


    public String addAddress(String id, String houseNumber,String streetName,String suburb,String postalCode,String city)
    {
        Address address = AddressFactory.buildAddress(id, houseNumber, streetName, suburb, postalCode, city);
        addressService.save(address);
        return new Gson().toJson(address);
    }


    public String readAddress(String id)
    {
        Address address = addressService.findById(id);
        return new Gson().toJson(address);
    }


    public String updateAddress(String id,String houseNumber,String streetName,String suburb,String postalCode,String city)
    {
        Address address = addressService.findById(id);

        if(address == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Address addressInsert = AddressFactory.buildAddress(id, houseNumber, streetName, suburb, postalCode, city);
        addressService.save(addressInsert);
        return new Gson().toJson(addressInsert);
    }

    public void deleteAddress(String id) {
        Address address = addressService.findById(id);
        if (address == null) {
            System.out.println("Record does not exist");
        } else {
            addressService.delete(address);
            System.out.println("Record deleted");
        }
    }

    public String getAllAddresses()
    {
        List<Address> address = addressService.getAddress();
        return new Gson().toJson(address);
    }

    public String getAddressCity(String city)
    {
        List<Address> address = addressService.getAddressCity(city);
        return new Gson().toJson(address);
    }


}
