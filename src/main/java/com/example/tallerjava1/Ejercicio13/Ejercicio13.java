package com.example.tallerjava1.Ejercicio13;
import java.time.LocalDate;
import java.time.LocalTime;

/*
* Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
* */

public class Ejercicio13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("La fecha de hoy es: " +date+" y la hora es: "+time);
    }
}
