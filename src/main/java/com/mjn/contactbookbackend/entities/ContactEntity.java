package com.mjn.contactbookbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactEntity extends AbstractContactEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactId;

    public ContactEntity(){};

    public ContactEntity(int id, String firstName, String lastName, String email, String contactNumber) {

    }

}
