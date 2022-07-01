package com.example.tallerjava1.Ejercicio1y2;
import java.util.Scanner;
public class Ejercicio1y2 {
    /* Ejercicio 1
    Declara 2 variables numéricas (con el valor que desees),
    he indica cual es mayor de los dos. Si son iguales indicarlo
    también. Ve cambiando los valores para comprobar que funciona.
    */

    /* Ejercicio 2
    Al ejercicio anterior agregar entrada por consola de dos
    valores e indicar si son mayores, menores o iguales.
    */

    public static void main(String[] args) {
        int numeroUno, numeroDos;
        String mensaje;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        numeroUno = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numeroDos = sc.nextInt();

        // Programación clásica.
        if(numeroUno > numeroDos){ // El valor 1 es mayor al 2
            System.out.println("El númeo uno es mayor al número dos. Número 1: "+numeroUno+" y Número 2: "+numeroDos);
        } else if(numeroUno < numeroDos) { // Los valores son iguales
            System.out.println("El númeo uno es menor al número dos. Número 1: "+numeroUno+" y Número 2: "+numeroDos);
        } else if (numeroUno == numeroDos) { // El valor 1 es menor al dos
            System.out.println("El númeo uno y el número dos son iguales. Número 1: "+numeroUno+" y Número 2: "+numeroDos);
        }

        // Java Ternary Operator --> Para if anidados no se utiliza el ternario porque lo vuelve poco legible
        /*
        mensaje = (numeroUno > numeroDos) ? ("El número uno es mayor al número dos. Número 1: "+numeroUno+" y Número 2: "+numeroDos) :
                    (numeroUno < numeroDos) ? ("El númeo uno es menor al número dos. Número 1: "+numeroUno+" y Número 2: "+numeroDos) :
                       ("El númeo uno y el número dos son iguales. Número 1: "+numeroUno+" y Número 2: "+numeroDos);
        System.out.println(mensaje);
        */

    }
}
