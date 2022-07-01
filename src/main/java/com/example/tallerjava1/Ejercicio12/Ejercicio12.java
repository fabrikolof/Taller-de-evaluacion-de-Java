package com.example.tallerjava1.Ejercicio12;


import java.util.Scanner;

/*Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.*/
public class Ejercicio12 {

    public static void comparator(String textShort, String textLong) {
        String res1 ="";
        String res2 ="";
        int len = textShort.length();
        for (int i = 0; i < len;i++) {

            if(textShort.charAt(i) != textLong.charAt(i)){
                res1 += " Diferente: "+textShort.charAt(i);
                res2 += " Diferente: "+textLong.charAt(i);
            }
        }
        System.out.println(res1);
        System.out.println(res2);
    }

    public static void main(String[] args) {
        String textOne, textTwo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        textOne = sc.nextLine();
        System.out.print("Ingrese otra palabra: ");
        textTwo = sc.nextLine();

        if(textOne.equals(textTwo)){
            System.out.println("Son palabras iguales.");
        } else if (textOne.length() <= textTwo.length()) {
            comparator(textOne, textTwo);
        } else if (textOne.length() >= textTwo.length()) {
            comparator(textTwo, textOne);
        }
    }
}
