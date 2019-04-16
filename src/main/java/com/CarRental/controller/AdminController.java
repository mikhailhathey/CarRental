package com.CarRental.controller;

import com.google.gson.Gson;
import com.CarRental.domain.Address;
import com.CarRental.domain.Admin;
import com.CarRental.factories.AddressFactory;
import com.CarRental.factories.AdminFactory;
import com.CarRental.services.Impl.AddressServiceImpl;
import com.CarRental.services.Impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class AdminController {

    
    private AdminServiceImpl adminService;


    public String addAdmin(String adminId, String adminName, String adminPassword)
    {
        Admin admin = AdminFactory.buildAdmin(adminId, adminName, adminPassword);
        adminService.save(admin);
        return new Gson().toJson(admin);
    }

    public String readAdmin(String adminId)
    {
        Admin admin = adminService.findById(adminId);
        return new Gson().toJson(admin);
    }

    public String updateAdmin(String adminId, String adminName, String adminPassword)
    {
        Admin admin = adminService.findById(adminId);

        if(admin == null)
        {
            return new Gson().toJson("Record does not exist");
        }

        Admin adminInsert = AdminFactory.buildAdmin(adminId, adminName, adminPassword);
        adminService.update(adminInsert);
        return new Gson().toJson(adminInsert);
    }

    public void deleteAdmin(String adminId) {
        Admin admin = adminService.findById(adminId);
        if (admin == null) {
            System.out.println("Record does not exist");
        } else {
            adminService.delete(admin);
            System.out.println("Record deleted");
        }
    }
}
