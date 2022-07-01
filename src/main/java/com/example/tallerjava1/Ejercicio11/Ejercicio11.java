package com.example.tallerjava1.Ejercicio11;

import java.util.Scanner;

/*
* Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
* indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
* */
public class Ejercicio11 {
    public static void main(String[] args) {
        int vocals = 0, len;
        String[] textArr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String text = sc.nextLine();
        len = text.length();
        textArr = text.split("");

        for (String s : textArr) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                vocals++;
            }
        }

        System.out.println("La longitud es de: "+len+" y tiene "+vocals+" vocales.");

    }
}
