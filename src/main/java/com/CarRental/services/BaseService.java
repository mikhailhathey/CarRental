package com.CarRental.services;

public interface BaseService <E, ID>{

    E save(E id);
    E findById(ID id);

}
