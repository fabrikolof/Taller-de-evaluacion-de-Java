package com.example.tallerjava1.Ejercicio9;
import java.util.Scanner;
/*
 *  Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e,
 *  adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
 * */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = "La sonrisa sera la mejor arma contra la tristeza";
        String newText = text.replace('a', 'e');

        System.out.print("Ingrese el texto que quiera añadir a la frase: ");
        String inputText = sc.nextLine();

        System.out.println(newText+" "+inputText);
    }
}
