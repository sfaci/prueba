package edu.manuel.examen;

public class Menu {
    String titulo;
    int numPlatos;
    float precio;

    public Menu(String titulo, int numPlatos, float precio) {
        this.titulo = titulo;
        this.numPlatos = numPlatos;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPlatos() {
        return numPlatos;
    }

    public void setNumPlatos(int numPlatos) {
        this.numPlatos = numPlatos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
