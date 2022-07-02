package com.example.tallerjava1.Ejercicio17;

/*
Crearemos una subclase llamada Lavadora con las siguientes características:

Su atributo es carga, además de los atributos heredados.
Por defecto, la carga es de 5 kg. Usa una constante para ello.
Los constructores que se implementarán serán:

Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:

Método get de carga.

precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
Llama al método padre y añade el código necesario.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
*/
public class Lavadora extends Electrodomestico {

    protected final int CARGABASE = 5;

    int carga = CARGABASE;

    public Lavadora() { //defecto
    }

    public Lavadora(int precio, double peso)
    {
        super(precio, peso);
    }

    public Lavadora(int precio, String color, char consumo, double peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    /*
    precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
    Llama al método padre y añade el código necesario.
    */
    public int precioFinal() {
        int precioFinal = super.precioFinal();
        if (this.getCarga() > 30) {
            return precioFinal + 50;
        } else {
            return precioFinal;
        }
    }
}
