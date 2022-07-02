package com.example.tallerjava1.Ejercicio18;

/*
Crear una clase llamada Serie con las siguientes características:

Sus atributos son título, numero de temporadas, entregado, género y creador.
Por defecto, el número de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.

Los constructores que se implementarán serán:

Un constructor por defecto.
Un constructor con el titulo y creador. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.

Los métodos que se implementara serán:

Métodos get de todos los atributos, excepto de entregado.
Métodos set de todos los atributos, excepto de entregado.
Sobrescribe los métodos toString.
*/
public class Serie implements Entregable{
    String titulo = "";
    int temporadas = 3;
    boolean entregado = false;
    String genero = "";
    String creador = "";

    public Serie() {
    }
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }


    /*
    entregar(): cambia el atributo prestado a true.

    devolver(): cambia el atributo prestado a false.

    isEntregado(): devuelve el estado del atributo prestado.

    Método compareTo (Object a), compara las horas estimadas en los videojuegos y
    en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario
    que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.
    */
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        Serie serie = (Serie) a; //Casting
        return serie.getTemporadas() > this.temporadas;
    }
}
