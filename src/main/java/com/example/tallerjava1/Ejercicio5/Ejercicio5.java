package com.example.tallerjava1.Ejercicio5;
/*
* Muestra los números impares y pares del 1 al 100 (ambos incluidos).
* Usa un bucle while.
* */
public class Ejercicio5 {
    public static void main(String[] args) {
        int counter = 100;
        while(counter>0) {
            if(counter%2 == 0) {
                System.out.println("Es par: "+counter);
            } else {
                System.out.println("Es impar: "+counter);
            }
            counter--;
        }
    }
}
