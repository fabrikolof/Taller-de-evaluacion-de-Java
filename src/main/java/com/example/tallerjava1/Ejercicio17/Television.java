package com.example.tallerjava1.Ejercicio17;

/*
Crearemos una subclase llamada Television con las siguientes características:

Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.

Los constructores que se implementarán serán:

Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:

Método get de resolución y sintonizador TDT.
precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
*/
public class Television extends Electrodomestico {
    int pulgadas = 20;
    boolean sintronizador = false;

    public Television() {
    }

    public Television(int precio, double peso) {
        super(precio, peso);
    }

    //Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
    public Television(int precio, String color, char consumo, double peso, int pulgadas, boolean sintronizador) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintronizador = sintronizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintronizador() {
        return sintronizador;
    }

    /*
    precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
    Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
    */
    public int precioFinal() {
        int res = super.getPrecio();
        if(this.getPulgadas()>40){
            res = res + ((res * 30)/100);
        }
        if(this.isSintronizador()){
            res += 50;
        }
        return res;
    }





}
