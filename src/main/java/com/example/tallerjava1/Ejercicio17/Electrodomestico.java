package com.example.tallerjava1.Ejercicio17;

/*
    Crearemos una superclase llamada Electrodoméstico con las siguientes características:

    Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indican que se podrán heredar.
    Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
    Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
    Los constructores que se implementarán serán:

    Un constructor por defecto.
    Un constructor con el precio y peso. El resto por defecto.
    Un constructor con todos los atributos.

    Los métodos que implementara serán:

    Métodos get de todos los atributos.
    comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocará al crear el objeto y
     no será visible.
    comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.
    precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:

    A-100
    B-80
    C-60
    D-50
    E-30
    F-10

    0-19kg=10
    20-49kg=50
    50-79kg=80
    80kg=100
* */
public class Electrodomestico {

    /*
    Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indican que se podrán heredar.
    Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
    Los colores disponibles son blancos, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
    */

    protected final int PRECIOBASE = 100;
    protected final String COLORBASE = "Blanco";
    protected final char CONSUMOBASE = 'F';
    protected final double PESOBASE = 5;

    private int precio = PRECIOBASE;
    private String color = COLORBASE;
    private char consumo = CONSUMOBASE;
    private double peso = PESOBASE;

    /*
    Un constructor por defecto.
    Un constructor con el precio y peso. El resto por defecto.
    Un constructor con todos los atributos.
    * */
    public Electrodomestico() {

    }

    public Electrodomestico(int precio, double peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(int precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    //Métodos get de todos los atributos.
    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    /*
        comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocará al crear el objeto y
         no será visible.

*/
    private char comprobarConsumoEnergetico(char letra) {
        char res;
        //comprueba que la letra es correcta
        // sino es correcta usara la letra por defecto --> 'F' --> CONSUMOBASE
        switch (letra) {
            case 'A':
                res = letra;
                break;
            case 'B':
                res = letra;
                break;
            case 'C':
                res = letra;
                break;
            case 'D':
                res = letra;
                break;
            case 'E':
                res = letra;
                break;
            case 'F':
                res = letra;
                break;
            default:
                res = CONSUMOBASE;
        }
        return res;
    }

    /*comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.*/
    // blancos, negro, rojo, azul y gris
    private String comprobarColor(String color) {
        String res;

        switch (color) {
            case "blancos":
                res = color;
                break;
            case "rojo":
                res = color;
                break;
            case "negro":
                res = color;
                break;
            case "azul":
                res = color;
                break;
            case "gris":
                res = color;
                break;
            default:
                res = COLORBASE;
        }
        return res;
    }


    /*precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
    *   A-100
        B-80
        C-60
        D-50
        E-30
        F-10

        0-19kg=10
        20-49kg=50
        50-79kg=80
        80kg=100
    * */
    public int precioFinal() {
        int res = PRECIOBASE;//100
        double peso = this.peso;
        switch (this.consumo) {
            case 'A':
                res += 100;
                break;
            case 'B':
                res += 80;
                break;
            case 'C':
                res += 60;
                break;
            case 'D':
                res += 50;
                break;
            case 'E':
                res += 30;
                break;
            case 'F':
                res += 10;
                break;
        }
        /*
        0-19kg=10
        20-49kg=50
        50-79kg=80
        80kg=100
        */
        if(peso >= 0 && peso <= 19){
            res += 10;
        } else if (peso >= 20 && peso <= 49) {
            res += 50;
        } else if (peso >= 50 && peso <= 79) {
            res += 80;
        } else {
            res += 100;
        }
        return res+this.precio;
    }



}
