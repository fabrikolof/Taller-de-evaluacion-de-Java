package com.example.tallerjava1.Ejercicio18;

/*
    Crearemos una clase Videojuego con las siguientes características:

    Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.

    Los constructores que se implementaran serán:

    Un constructor por defecto.
    Un constructor con el titulo y horas estimadas. El resto por defecto.
    Un constructor con todos los atributos, excepto de entregado.

    Los métodos que se implementara serán:

    Métodos get de todos los atributos, excepto de entregado.
    Métodos set de todos los atributos, excepto de entregado.
    Sobrescribe los métodos toString.
    */
public class Videojuego implements Entregable {
    String titulo = "";
    int horas = 10;
    boolean entregado = false;
    String genero = "";
    String compania = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
    }

    public Videojuego(String titulo, int horas, String genero, String compania) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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
        Videojuego juego = (Videojuego) a; //Casting
        return juego.getHoras() > this.horas;
    }
}
