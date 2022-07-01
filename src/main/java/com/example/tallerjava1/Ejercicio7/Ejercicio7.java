package com.example.tallerjava1.Ejercicio7;

import java.util.Scanner;

/*
 *  Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 *  si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 * */

public class Ejercicio7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número para evaluar: ");
            num = sc.nextInt();
            System.out.println("El número ingresado es: " + num);
        } while (num < 0);
    }
}
