package com.CarRental.factories;

import com.CarRental.domain.RentalTerm;

public class RentalTermFactory {

    public static RentalTerm buildRentalTerm(String id, String houseNumber, String streetName, String suburb, String postalCode, String city)
    {
        RentalTerm rentalTerm = new RentalTerm.Builder()
                .id(id)
                .houseNumber(houseNumber)
                .streetName(streetName)
                .suburb(suburb)
                .postalCode(postalCode)
                .city(city)
                .build();
        return rentalTerm;
    }
}
