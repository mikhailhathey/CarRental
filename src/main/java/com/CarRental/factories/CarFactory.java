package com.CarRental.factories;

import com.CarRental.domain.Car;

public class CarFactory {

    public static Car buildCar(String carId, String houseNumber, String streetName, String suburb, String postalCode, String city)
    {
        Car car = new Car.Builder()
                .carId(carId)
                .houseNumber(houseNumber)
                .streetName(streetName)
                .suburb(suburb)
                .postalCode(postalCode)
                .city(city)
                .build();
        return car;
    }
}
