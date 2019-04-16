package com.CarRental.controller;

import com.CarRental.domain.Car;
import com.CarRental.factories.CarFactory;
import com.CarRental.services.Impl.CarServiceImpl;

import java.util.List;


public class CarController {


    private CarServiceImpl carService;


    public String addCar(String carId, String houseNumber,String streetName,String suburb,String postalCode,String city)
    {
        Car car = CarFactory.buildCar(carId, houseNumber, streetName, suburb, postalCode, city);
        carService.save(car);
        return new Gson().toJson(car);
    }


    public String readCar(String carId)
    {
        Car car = carService.findById(carId);
        return new Gson().toJson(car);
    }


    public String updateCar(String carId,String houseNumber,String streetName,String suburb,String postalCode,String city)
    {
        Car car = carService.findById(carId);

        if(car == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Car carInsert = CarFactory.buildCar(carId, houseNumber, streetName, suburb, postalCode, city);
        carService.save(carInsert);
        return new Gson().toJson(carInsert);
    }

    public vocarId deleteCar(String carId) {
        Car car = carService.findById(carId);
        if (car == null) {
            System.out.println("Record does not exist");
        } else {
            carService.delete(car);
            System.out.println("Record deleted");
        }
    }

    public String getAllCars()
    {
        List<Car> car = carService.getCar();
        return new Gson().toJson(car);
    }

    public String getCarCity(String city)
    {
        List<Car> car = carService.getCarCity(city);
        return new Gson().toJson(car);
    }


}
