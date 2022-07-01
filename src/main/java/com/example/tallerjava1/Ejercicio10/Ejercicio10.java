package com.example.tallerjava1.Ejercicio10;
import java.util.Scanner;
/*
* Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una fras: ");
        String text = sc.nextLine();
        String newText = text.replace(" ", "");
        System.out.println(newText);
    }
}
