package com.CarRental.repositories;

import com.CarRental.domain.RentalTerm;

public interface RentalTermRepository extends CrudRepository<RentalTerm, String> {

    public List<RentalTerm> findByAge(int age);
    public List<RentalTerm> findById(String id);

}
