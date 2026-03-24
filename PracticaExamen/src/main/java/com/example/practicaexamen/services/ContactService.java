package com.example.practicaexamen.services;

import com.example.practicaexamen.model.Contacto;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contacto> listContacts = new ArrayList<>();

    public List<Contacto> getAllContacts(){
        return listContacts;
    }

    public void addContact(Contacto contacto){
        listContacts.add(contacto);
    }
}
