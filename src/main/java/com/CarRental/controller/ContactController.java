package com.CarRental.controller;

import com.CarRental.domain.Contact;
import com.CarRental.factories.ContactFactory;
import com.CarRental.services.Impl.ContactServiceImpl;


public class ContactController {


    private ContactServiceImpl contactService;

    public void addContact(String contactId, String contactCell, String contactHome, String contactEmail)
    {
        Contact contact = ContactFactory.buildContact(contactId, contactCell, contactHome, contactEmail);
        contactService.save(contact);
    }


    public void readContact(String contactId)
    {
        Contact contact = contactService.findById(contactId);
    }


}
