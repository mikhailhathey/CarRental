package com.CarRental.repositories;

import com.CarRental.domain.Address;

public interface AddressRepository extends CrudRepository<Address, String> {

    public List<Address> findByAge(int age);
    public List<Address> findById(String id);

}
