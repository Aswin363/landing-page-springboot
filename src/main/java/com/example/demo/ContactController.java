package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // frontend allow
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @PostMapping("/submit")
    public Contact saveContact(@RequestBody Contact contact) {
        return repo.save(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return repo.findAll();
    }
}
