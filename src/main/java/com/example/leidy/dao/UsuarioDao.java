package com.example.leidy.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsuarioDao {
    /* como se llama el archivo */
    public static final String NOMBRE_ARCHIVO = "usuario.json";
    /* carpeta*/

    private final Path archivo;

    public UsuarioDao(){
        String directorioUsuario = System.getProperty("usar.dir");
        this.archivo = Paths.get(directorioUsuario, NOMBRE_ARCHIVO);

    }
    /* GUARDAR ALGO*/
    public void guardarNombre(String nombre) {
        try{
            Files.writeString(this.archivo, nombre);

        } catch (IOException ex){
            System.out.println("no se puede guardar el nombre: "+ nombre);
        }
    }
    public String leerNombre(){
        String resultado = "";
        if (!Files.exists(this.archivo)) {
            return "";
        }
        try{
            resultado = Files.readString(this.archivo);
        }catch (IOException ex){
            System.out.println("no se pudo leer el nombre: ");
        }
        return resultado;
    }
}

