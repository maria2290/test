package com.example.leidy.model;

import com.example.leidy.dto.Usuariodto;
import java.util.ArrayList;

public class UsuarioModel {
    private final ArrayList<Usuariodto> usuarios = new ArrayList<>();

    public ArrayList<Usuariodto> getUsuarios() {
        return usuarios;
    }


    public void crearUsuario(Usuariodto usuario) {
        usuarios.add(usuario);
    }


    public void eliminarUsuario(String id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(id)) {
                usuarios.remove(i);
                break;
            }
        }
    }


    public void actualizar(Usuariodto usuarioActualizado) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(usuarioActualizado.getId())) {
                usuarios.set(i, usuarioActualizado);
                break;
            }
        }
    }
}


