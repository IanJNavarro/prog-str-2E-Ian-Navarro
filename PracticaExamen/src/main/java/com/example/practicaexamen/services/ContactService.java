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

    public void updateContact(int index, Contacto updatedContact){
        if (index >=0){
            listContacts.set(index, updatedContact);
        }
    }

    public int searchIndex(String name){
        for (int i=0; i < listContacts.size(); i++){
            if(listContacts.get(i).getName().trim().equalsIgnoreCase(name.trim())){
                return i;
            }
        }
        return -1;
    }

    public Contacto search(int index){
        return listContacts.get(index);
    }

    public void deleteContact(int index){
        if (index >= 0) {
            listContacts.remove(index);
        }
    }
}
