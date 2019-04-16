package com.CarRental.services.Impl;

import com.CarRental.domain.RentalTerm;
import com.CarRental.repositories.RentalTermRepository;
import com.CarRental.services.RentalTermService;

import java.util.ArrayList;
import java.util.List;


public class RentalTermServiceImpl implements RentalTermService {


    private RentalTermRepository repository;

   @Override
    public RentalTerm save(RentalTerm entity)
   {
       return repository.save(entity);
   }

   @Override
    public RentalTerm findById(String s)
   {
       return repository.findOne(s);
   }

   @Override
    public RentalTerm update(RentalTerm entity)
   {
       return repository.save(entity);
   }

   @Override
    public void delete(RentalTerm entity)
   {
       repository.delete(entity);
   }

   //return all rentalTermes
    public List<RentalTerm> getRentalTerm() {

        List<RentalTerm> allRentalTerm = new ArrayList<RentalTerm>();

        Iterable<RentalTerm> rentalTerm = repository.findAll();
        for (RentalTerm addr : rentalTerm) {
            allRentalTerm.add(addr);
        }
        return allRentalTerm;
    }

    //return all requested cities
    public List<RentalTerm> getRentalTermCity(String city) {

        List<RentalTerm> allRentalTerm = new ArrayList<RentalTerm>();

        Iterable<RentalTerm> rentalTerm = repository.findAll();

        for (RentalTerm addr : rentalTerm) {

            /*System.out.println("RentalTerm City: " + addr.getCity());
            System.out.println("City: " + city);*/

            String value = addr.getCity();

            /*if(a.equals(city))
            {
                System.out.println("Match");
            }*/

            if(city.equals(value))
            {
                allRentalTerm.add(addr);
            }
        }
        return allRentalTerm;
    }

}
