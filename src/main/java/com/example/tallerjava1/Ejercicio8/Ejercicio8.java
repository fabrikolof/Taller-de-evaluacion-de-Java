package com.example.tallerjava1.Ejercicio8;
import java.util.Scanner;

/*
*  Crea una aplicación por consola que nos pida un día de la semana y
*  que nos diga si es un día laboral o no. Usa un switch para ello.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un día de la semana: ");
        String day = sc.nextLine();
        switch (day.toLowerCase()){
            case "lunes":
                System.out.print("El día es laborable");
                break;
            case "martes":
                System.out.print("El día es laborable");
                break;
            case "miercoles":
                System.out.print("El día es laborable");
                break;
            case "jueves":
                System.out.print("El día es laborable");
                break;
            case "viernes":
                System.out.print("El día es laborable");
                break;
            case "sabado":
                System.out.print("El día no es laborable");
                break;
            case "domingo":
                System.out.print("El día no es laborable");
                break;
            default:
                System.out.print("Dato ingresado no valido");
        }
    }
}
