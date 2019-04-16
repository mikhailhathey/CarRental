package com.CarRental.services.Impl;

import com.CarRental.domain.Admin;
import com.CarRental.repositories.AdminRepository;
import com.CarRental.services.AdminService;

public class AdminServiceImpl implements AdminService {

    private AdminRepository repository;

   @Override
    public Admin save(Admin entity)
   {
       return repository.save(entity);
   }

   @Override
    public Admin findById(String s)
   {
       return repository.findOne(s);
   }

   @Override
    public Admin update(Admin entity)
   {
       return repository.save(entity);
   }

   @Override
    public void delete(Admin entity)
   {
       repository.delete(entity);
   }
}
