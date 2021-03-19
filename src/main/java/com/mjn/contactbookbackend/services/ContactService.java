package com.mjn.contactbookbackend.services;


import com.mjn.contactbookbackend.entities.ContactEntity;
import com.mjn.contactbookbackend.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;


//    public List<ContactEntity> getAll(){
//        ArrayList<ContactEntity> contacts = new ArrayList<>();
//        contactRepository.findAll().forEach(t -> contacts.add(t));
//        return contacts;
//    }
}
