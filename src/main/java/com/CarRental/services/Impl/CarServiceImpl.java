package com.CarRental.services.Impl;

import com.CarRental.domain.Car;
import com.CarRental.repositories.CarRepository;
import com.CarRental.services.CarService;

import java.util.ArrayList;
import java.util.List;


public class CarServiceImpl implements CarService {


    private CarRepository repository;

   @Override
    public Car save(Car entity)
   {
       return repository.save(entity);
   }

   @Override
    public Car findById(String s)
   {
       return repository.findOne(s);
   }

   @Override
    public Car update(Car entity)
   {
       return repository.save(entity);
   }

   @Override
    public void delete(Car entity)
   {
       repository.delete(entity);
   }

   //return all cares
    public List<Car> getCar() {

        List<Car> allCar = new ArrayList<Car>();

        Iterable<Car> car = repository.findAll();
        for (Car addr : car) {
            allCar.add(addr);
        }
        return allCar;
    }

    //return all requested cities
    public List<Car> getCarCity(String city) {

        List<Car> allCar = new ArrayList<Car>();

        Iterable<Car> car = repository.findAll();

        for (Car addr : car) {

            /*System.out.println("Car City: " + addr.getCity());
            System.out.println("City: " + city);*/

            String value = addr.getCity();

            /*if(a.equals(city))
            {
                System.out.println("Match");
            }*/

            if(city.equals(value))
            {
                allCar.add(addr);
            }
        }
        return allCar;
    }

}
