package com.CarRental.repositories;

import com.CarRental.domain.Car;

public interface CarRepository extends CrudRepository<Car, String> {

    public List<Car> findByAge(int age);
    public List<Car> findById(String carId);

}
