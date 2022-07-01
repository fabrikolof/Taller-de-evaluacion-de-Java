package com.example.tallerjava1.Ejercicio3;

import java.nio.channels.Pipe;
import java.util.Scanner;


/*
* Haz una aplicación que calcule el área de un círculo(pi*R2).
* El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
* Usa la constante PI y el método pow de Math.
*/

public class Ejercicio3 {

    public static void main(String[] args) {
        double res;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio a calcular: ");
        double radio = sc.nextDouble();

        res = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: "+res);
    }

}
