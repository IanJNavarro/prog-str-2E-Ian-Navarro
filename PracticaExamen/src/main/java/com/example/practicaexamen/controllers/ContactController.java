package com.example.practicaexamen.controllers;

import com.example.practicaexamen.model.Contacto;
import com.example.practicaexamen.services.ContactService;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

public class ContactController {
    private String[] arrParents={"Padre", "Madre", "Hermano", "Hermana", "Abuelo", "Abuela", "Tio", "Tia"};

    @FXML
    private ComboBox<String> cbParentesco;
    private ObservableList<String> listObservableParent = FXCollections.observableArrayList();

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtNum;
    @FXML
    private ListView<Contacto> listViewContacts;
    private ObservableList<Contacto> listObservableContacts = FXCollections.observableArrayList();

    private ContactService service = new ContactService();

    @FXML
    public void initialize(){
        listObservableParent.setAll(arrParents);
        cbParentesco.setItems(listObservableParent);
    }

    @FXML
    public void onAddContact(){
        String name = txtName.getText().trim();
        String num = txtNum.getText();
        String parent = cbParentesco.getValue();

        Contacto contact = new Contacto(name, num, parent);

        service.addContact(contact);

        listObservableContacts.setAll(service.getAllContacts());
        listViewContacts.setItems(listObservableContacts);

        System.out.println(service.getAllContacts());

    }
}
