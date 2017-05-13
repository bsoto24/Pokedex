package com.openlab.pokedex;

import java.io.Serializable;

/**
 * Created by Bryam Soto on 06/05/2017.
 */

public class Pokemon implements Serializable{

    private String nombre;
    private int imagen;

    public Pokemon(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", imagen=" + imagen +
                '}';
    }
}
