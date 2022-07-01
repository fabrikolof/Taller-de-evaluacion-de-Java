package com.example.tallerjava1.Ejercicio6;
/*
* Realiza el ejercicio anterior usando un ciclo for.
* */
public class Ejercicio6 {
    public static void main(String[] args) {
        for(int i = 100; i > 0; i--) {
            if(i % 2 == 0) {
                System.out.println("Es par: "+i);
            } else {
                System.out.println("Es impar: "+i);
            }
        }
    }
}
