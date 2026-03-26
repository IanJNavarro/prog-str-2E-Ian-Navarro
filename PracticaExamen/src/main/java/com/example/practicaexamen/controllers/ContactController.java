package com.example.practicaexamen.controllers;

import com.example.practicaexamen.model.Contacto;
import com.example.practicaexamen.services.ContactService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ContactController {
    private String[] arrParents = {"Padre", "Madre", "Hermano", "Hermana", "Abuelo", "Abuela", "Tio", "Tia"};

    @FXML
    private ComboBox<String> cbParentesco;
    private ObservableList<String> listObservableParent = FXCollections.observableArrayList();

    @FXML
    private TextField txtSearch;
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
        listViewContacts.getSelectionModel().selectedItemProperty().addListener( (observable, oldValue, newValue) ->{
            populateFields(newValue);
        });
    }

    @FXML
    public void onAddContact(){
        String name = txtName.getText().trim();
        String num = txtNum.getText();
        String parent = cbParentesco.getValue();

        Contacto contact = new Contacto(name, num, parent);

        service.addContact(contact);

        showList();
        clearForm();

    }

    @FXML
    public void onSearch(){
        String name = txtSearch.getText();

        int index = service.searchIndex(name);
        Contacto contacto = service.search(index);

        populateFields(contacto);

        txtSearch.clear();
    }

    @FXML
    public void onUpdateContact(){
        int index = listViewContacts.getSelectionModel().getSelectedIndex();

        String name = txtName.getText().trim();
        String num = txtNum.getText();
        String parent = cbParentesco.getValue();

        Contacto updatedContact = new Contacto(name, num, parent);

        service.updateContact(index, updatedContact);

        showList();
        clearForm();
    }

    @FXML
    public void onDeleteContact(){
        int index = listViewContacts.getSelectionModel().getSelectedIndex();

        service.deleteContact(index);

        showList();
        clearForm();

    }

    private void populateFields(Contacto contacto){
        if (contacto != null) {
            txtName.setText(contacto.getName());
            txtNum.setText(contacto.getPhone());
            cbParentesco.setValue(contacto.getParent());
        } else clearForm();
    }

    private void showList(){
        listObservableContacts.setAll(service.getAllContacts());
        listViewContacts.setItems(listObservableContacts);
    }

    private void clearForm(){
        txtName.clear();
        txtNum.clear();
        cbParentesco.setValue(null);
    }
}
