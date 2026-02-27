package org.example.logindashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Login {
    public Login(){
    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;

    public void userLog(ActionEvent event){
        checkLogin();
    }

    private void checkLogin(){

    }

}
