package com.CarRental.services.Impl;

import com.CarRental.domain.Address;
import com.CarRental.repositories.AddressRepository;
import com.CarRental.services.AddressService;

import java.util.ArrayList;
import java.util.List;



public class AddressServiceImpl implements AddressService {


    private AddressRepository repository;

   @Override
    public Address save(Address entity)
   {
       return repository.save(entity);
   }

   @Override
    public Address findById(String s)
   {
       return repository.findOne(s);
   }

   @Override
    public Address update(Address entity)
   {
       return repository.save(entity);
   }

   @Override
    public void delete(Address entity)
   {
       repository.delete(entity);
   }

   //return all addresses
    public List<Address> getAddress() {

        List<Address> allAddress = new ArrayList<Address>();

        Iterable<Address> address = repository.findAll();
        for (Address addr : address) {
            allAddress.add(addr);
        }
        return allAddress;
    }

    //return all requested cities
    public List<Address> getAddressCity(String city) {

        List<Address> allAddress = new ArrayList<Address>();

        Iterable<Address> address = repository.findAll();

        for (Address addr : address) {

            /*System.out.println("Address City: " + addr.getCity());
            System.out.println("City: " + city);*/

            String value = addr.getCity();

            /*if(a.equals(city))
            {
                System.out.println("Match");
            }*/

            if(city.equals(value))
            {
                allAddress.add(addr);
            }
        }
        return allAddress;
    }

}
