package com.openlab.pokedex;

import java.io.Serializable;

/**
 * Created by Bryam Soto on 06/05/2017.
 */

public class Pokemon implements Serializable{

    private String nombre;
    private String tipo;
    private String vida;
    private String ataque;
    private int imagen;

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, String vida, String ataque, int imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
