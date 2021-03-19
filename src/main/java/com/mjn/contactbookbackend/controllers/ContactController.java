package com.mjn.contactbookbackend.controllers;

import com.mjn.contactbookbackend.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact/getContacts")
    public String getContacts(Model model){
        model.addAttribute("contacts", contactService.getAll());
        return "viewContactsPage";
    }
}
