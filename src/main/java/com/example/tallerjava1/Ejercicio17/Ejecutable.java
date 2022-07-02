package com.example.tallerjava1.Ejercicio17;
    /*
    Ahora crea una clase ejecutable que realice lo siguiente:

    Crea un array de Electrodomesticos de 10 posiciones.

    Asigna a cada posición un objeto de las clases anteriores con los valores que desees.

    Ahora, recorre este array y ejecuta el método precioFinal().

    Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado,
    el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico,
    pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.

    Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500,
    el resultado final sera de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
    */

import java.util.ArrayList;
import java.util.Arrays;

public class Ejecutable {
    public static void main(String[] args) {
        int precioLavadoras = 0;
        int precioTelevisiones = 0;
        int precioElectrodomesticos = 0;
        int precioTotal = 0;

        Electrodomestico electrodomestico[] = new Electrodomestico[10];
        electrodomestico[0] = new Lavadora();
        electrodomestico[1] = new Television();
        electrodomestico[2] = new Lavadora(1500, 120);
        electrodomestico[3] = new Television(500, 30);
        electrodomestico[4] = new Lavadora(800, "azul", 'C', 100, 80);
        electrodomestico[5] = new Television(800, 20);
        electrodomestico[6] = new Lavadora(400, "blanco", 'B', 80, 50);
        electrodomestico[7] = new Television(400, "negro", 'B', 50, 120, true);
        electrodomestico[8] = new Electrodomestico();
        electrodomestico[9] = new Electrodomestico(700, "azul", 'A', 400);

        for(Electrodomestico ele : electrodomestico){
            if(ele instanceof Lavadora) {
                precioLavadoras += ele. precioFinal();
            } else if (ele instanceof Television) {
                precioTelevisiones += ele. precioFinal();
            } else if (ele instanceof Electrodomestico){
                precioElectrodomesticos += ele. precioFinal();
            }
        }

        precioTotal = precioLavadoras + precioTelevisiones + precioElectrodomesticos;
        System.out.println("El precio total es: $"+precioTotal+" Lavadoras: $"+precioLavadoras+
                " Televisiones: $"+precioTelevisiones+" Electrodomésticos: $"+precioElectrodomesticos);
    }
}
