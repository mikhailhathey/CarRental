package com.CarRental.services.Impl;

import com.CarRental.domain.Contact;
import com.CarRental.repositories.ContactRepository;
import com.CarRental.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ContactServiceImpl implements ContactService {


    private ContactRepository repository;

    @Override
    public Contact save(Contact id) {
        return null;
    }

    @Override
    public Contact findById(String s) {
        return null;
    }
}
