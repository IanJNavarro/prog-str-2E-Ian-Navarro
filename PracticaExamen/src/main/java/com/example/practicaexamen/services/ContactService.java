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
        String name = contacto.getName();

        validator(contacto);


        for (Contacto c: listContacts){
            if (name.equalsIgnoreCase(c.getName())){
                throw new IllegalArgumentException("Contacto Existente");
            }
        }
        listContacts.add(contacto);
    }

    public void updateContact(int index, Contacto updatedContact){
        validator(updatedContact);
        if (index >=0){
            listContacts.set(index, updatedContact);
        }
    }

    public int searchIndex(String name){
        if (name == null||name.isBlank()){
            throw new IllegalArgumentException("Ingresa algo para buscar");
        }
        for (int i=0; i < listContacts.size(); i++){
            if(listContacts.get(i).getName().trim().equalsIgnoreCase(name.trim())){
                return i;
            }
        }
        throw new IllegalArgumentException("Nombre no encontrado");
    }

    public Contacto search(int index){
        return listContacts.get(index);
    }

    public void deleteContact(int index){
        if (index >= 0) {
            listContacts.remove(index);
        }
    }

    private void validator(Contacto contact){
        String name = contact.getName();
        String phoneNum = contact.getPhone();
        String parent = contact.getParent();
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Nombre no Valido");
        }

        else if (phoneNum == null || phoneNum.length() != 10 || !phoneNum.matches("^[0-9]+$")){
            throw new IllegalArgumentException("Numero Incorrecto");
        }

        else if (parent == null){
            throw new IllegalArgumentException("Relacion no valida");
        }
    }


}
