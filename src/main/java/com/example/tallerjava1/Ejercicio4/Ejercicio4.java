package com.example.tallerjava1.Ejercicio4;

import java.util.Scanner;

/*
 Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
 calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        double res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        res = precio*1.21;
        System.out.println("El precio total es: "+res);
    }

}

