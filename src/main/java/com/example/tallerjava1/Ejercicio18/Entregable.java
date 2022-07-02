package com.example.tallerjava1.Ejercicio18;
/*Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:*/
public interface Entregable {
    void entregar();
    void devolver();
    boolean isEntregado();
    boolean compareTo (Object a);
}
