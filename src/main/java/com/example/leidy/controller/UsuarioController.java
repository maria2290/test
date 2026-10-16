package com.example.leidy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class UsuarioController {

    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtCorreo;

    @FXML
    public TextField txtcontrasena;

    @FXML
    public void onUsuarioButtonClick() { lblMensaje.setText();

    }

}
