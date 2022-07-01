package com.example.tallerjava1.Ejercicio15;

import java.util.Scanner;

/*
*    Hacer un programa que muestre el siguiente menú de opciones
    ****** GESTION CINEMATOGRÁFICA ********
    1-NUEVO ACTOR
    2-BUSCAR ACTOR
    3-ELIMINAR ACTOR
    4-MODIFICAR ACTOR
    5-VER TODOS LOS ACTORES
    6-VER PELICULAS DE LOS ACTORES
    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
    8-SALIR

    EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO
    OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU
    SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
    PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
* */
public class Ejercicio15 {
    public static void main(String[] args) {
        //el do while primero muestra, después pregunta
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("" +
                    "    ****** GESTION CINEMATOGRÁFICA ********\n" +
                    "    1-NUEVO ACTOR\n" +
                    "    2-BUSCAR ACTOR\n" +
                    "    3-ELIMINAR ACTOR\n" +
                    "    4-MODIFICAR ACTOR\n" +
                    "    5-VER TODOS LOS ACTORES\n" +
                    "    6-VER PELICULAS DE LOS ACTORES\n" +
                    "    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "    8-SALIR");

            num = sc.nextInt();//no puedo definir variables dentro del do while

            switch (num) {
                case 1:
                    System.out.println("NUEVO ACTOR");
                    break;
                case 2:
                    System.out.println("BUSCAR ACTOR");
                    break;
                case 3:
                    System.out.println("ELIMINAR ACTOR");
                    break;
                case 4:
                    System.out.println("MODIFICAR ACTOR");
                    break;
                case 5:
                    System.out.println("VER TODOS LOS ACTORES");
                    break;
                case 6:
                    System.out.println("VER PELICULAS DE LOS ACTORES");
                    break;
                case 7:
                    System.out.println("VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Error");
            }
        } while (num != 8);//mientras num no sea 8 se ejecuta
    }
}
