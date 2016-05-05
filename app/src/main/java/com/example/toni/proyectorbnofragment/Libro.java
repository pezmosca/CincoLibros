package com.example.toni.proyectorbnofragment;

/**
 * Created by Toni on 04/05/2016.
 */
public class Libro {
    private int titulo;
    private int autor;
    private int year;
    private int explicacion;
    private int portada;

    public Libro(int titulo, int autor, int year, int explicacion, int portada) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        this.explicacion = explicacion;
        this.portada = portada;
    }


    public int getTitulo() {
        return titulo;
    }

    public int getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    public int getExplicacion() {
        return explicacion;
    }

    public int getPortada() {
        return portada;
    }
}
