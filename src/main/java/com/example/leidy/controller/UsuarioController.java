package com.example.leidy.controller;

import com.example.leidy.dto.Usuariodto;
import com.example.leidy.dto.Usuariodto;
import com.example.leidy.model.UsuarioModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class UsuarioController {

    @FXML
    public Label lblMensaje;
    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtCorreo;
    @FXML
    public TextField txtcontrasena;
    @FXML
    public TextField txtDireccion;
    public Button btnEliminar;
    public TableColumn colId;
    public TableColumn colNombre;
    public TableColumn colCorreo;
    public TableView tableUsuario;


    @FXML
    public void onUsuarioButtonClick() {

    }

    @FXML
    public void handleActualizarUsuario(ActionEvent actionEvent) {
        /*
        if (usuarioSeleccionado != null) {
            usuarioSeleccionado.setNombre(txtNombre.getText());
            usuarioSeleccionado.setContrasena(txtcontrasena.getText());
            usuarioSeleccionado.setCorreo(txtCorreo.getText());
            usuarioSeleccionado.setDireccion(txtDireccion.getText());

            usuarioModel.actualizar(usuarioSeleccionado);
            lblMensaje.setText("Usuario actualizado con éxito.");
            limpiarCampos();
            usuarioSeleccionado = null;
        } else {
            lblMensaje.setText("Selecciona un usuario para actualizar.");
        }
        */
    }


    @FXML
    public void handleEliminarUsuario(ActionEvent actionEvent) {
        /*
        if (usuarioSeleccionado != null) {
            usuarioModel.eliminarUsuario(usuarioSeleccionado.getId());
            lblMensaje.setText("Usuario eliminado exitosamente.");
            limpiarCampos();
            usuarioSeleccionado = null;
        } else {
            lblMensaje.setText("Selecciona un usuario para eliminar.");
        }
         */
    }


    private void limpiarCampos() {
        txtNombre.clear();
        txtCorreo.clear();
        txtcontrasena.clear();
        txtDireccion.clear();
    }

    public void handleSeleccionar(MouseEvent mouseEvent) {
    }
}
