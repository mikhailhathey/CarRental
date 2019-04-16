package com.CarRental.controller;

import com.CarRental.domain.RentalTerm;
import com.CarRental.factories.RentalTermFactory;
import com.CarRental.services.Impl.RentalTermServiceImpl;

import java.util.List;


public class RentalTermController {


    private RentalTermServiceImpl rentalTermService;


    public String addRentalTerm(String id, String houseNumber,String streetName,String suburb,String postalCode,String city)
    {
        RentalTerm rentalTerm = RentalTermFactory.buildRentalTerm(id, houseNumber, streetName, suburb, postalCode, city);
        rentalTermService.save(rentalTerm);
        return new Gson().toJson(rentalTerm);
    }


    public String readRentalTerm(String id)
    {
        RentalTerm rentalTerm = rentalTermService.findById(id);
        return new Gson().toJson(rentalTerm);
    }


    public String updateRentalTerm(String id,String houseNumber,String streetName,String suburb,String postalCode,String city)
    {
        RentalTerm rentalTerm = rentalTermService.findById(id);

        if(rentalTerm == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        RentalTerm rentalTermInsert = RentalTermFactory.buildRentalTerm(id, houseNumber, streetName, suburb, postalCode, city);
        rentalTermService.save(rentalTermInsert);
        return new Gson().toJson(rentalTermInsert);
    }

    public void deleteRentalTerm(String id) {
        RentalTerm rentalTerm = rentalTermService.findById(id);
        if (rentalTerm == null) {
            System.out.println("Record does not exist");
        } else {
            rentalTermService.delete(rentalTerm);
            System.out.println("Record deleted");
        }
    }

    public String getAllRentalTermes()
    {
        List<RentalTerm> rentalTerm = rentalTermService.getRentalTerm();
        return new Gson().toJson(rentalTerm);
    }

    public String getRentalTermCity(String city)
    {
        List<RentalTerm> rentalTerm = rentalTermService.getRentalTermCity(city);
        return new Gson().toJson(rentalTerm);
    }


}
