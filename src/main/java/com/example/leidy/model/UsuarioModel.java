package com.example.leidy.model;

import com.example.leidy.dto.Usuariodto;

import java.util.ArrayList;

public class UsuarioModel {
    private final ArrayList<Usuariodto> usuarios =  new ArrayList<>();


    public ArrayList<Usuariodto> getUsuarios() {
        return usuarios;
    }

    public void crearUsuario(Usuariodto usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuariodto usuario) {
        usuarios.remove(usuario);
    }

    public void actualizar(Usuariodto usuario ){
        usuarios.add(usuario);

    }
   
}


