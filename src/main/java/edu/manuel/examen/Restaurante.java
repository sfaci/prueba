package edu.manuel.examen;

public class Restaurante {
    String nombre;
    String categoria;
    String direccion;

    public Restaurante(String nombre, String categoria, String direccion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
