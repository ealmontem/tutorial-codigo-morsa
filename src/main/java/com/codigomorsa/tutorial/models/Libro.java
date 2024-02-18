package com.codigomorsa.tutorial.models;

public class Libro {
    private String isbn;
    private String nombre;
    private String editorial;

    public Libro() {
    }

    public Libro(String isbn, String nombre, String editorial) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
