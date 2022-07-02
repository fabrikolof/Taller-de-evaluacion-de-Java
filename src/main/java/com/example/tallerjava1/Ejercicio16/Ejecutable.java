package com.example.tallerjava1.Ejercicio16;

/*
    Ahora, crea una clase ejecutable que haga lo siguiente:

    Pide por teclado el nombre, la edad, sexo, peso y altura.
    Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los
    anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
    Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
    Indicar para cada objeto si es mayor de edad.
    Por último, mostrar la información de cada objeto.
* */

import java.util.Scanner;

public class Ejecutable {
    public static void checkPeso(Persona per, int num) {
        if(num==1){
            System.out.println(per.getName()+" tiene sobrepeso.");
        } else if (num==0) {
            System.out.println(per.getName()+" tiene el peso ideal.");
        } else if (num==-1){
            System.out.println(per.getName()+" tiene que comer más, estas por debajo de lo ideal.");
        }
    }

    public static void checkEdad(Persona per, boolean mayor) {
        if(mayor){
            System.out.println(per.getName()+" es mayor de edad.");
        } else {
            System.out.println(per.getName()+" es menor de edad.");
        }
    }
    public static void main(String[] args) {
       /* Pide por teclado el nombre, la edad, sexo, peso y altura.*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int age = sc.nextInt();

        System.out.println("Ingrese su sexo: ");
        String sexoStr = sc.next();
        //System.out.println(sexoStr);
        char sexo = sexoStr.charAt(0);

        System.out.println("Ingrese su altura: ");
        double height = sc.nextDouble();

        System.out.println("Ingrese su peso: ");
        double weight = sc.nextDouble();

        /*Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado,
        el segundo objeto obtendrá todos los anteriores menos el peso y la altura */
        Persona per1 = new Persona(name, age, height, weight, sexo);
        Persona per2 = new Persona(name, age, sexo);

        /*y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.*/
        Persona per3 = new Persona();
        per3.setName("Roberto");
        per3.setAge(20);
        per3.setHeight(1.50);
        per3.setSexo('T');
        per3.setWeight(120.9);

        /*Para cada objeto, deberá comprobar si está en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.*/
        // 1 sobrepeso  ---- -1 = underpeso ----- 0 = ideal
        checkPeso(per1, per1.calcularIMC());
        checkPeso(per2, per2.calcularIMC());
        checkPeso(per3, per3.calcularIMC());

        /*Indicar para cada objeto si es mayor de edad.*/
        checkEdad(per1, per1.esMayorDeEdad());
        checkEdad(per2, per2.esMayorDeEdad());
        checkEdad(per3, per3.esMayorDeEdad());

        /*
        Por último, mostrar la información de cada objeto.
        * */
        System.out.println(per1.toString());
        System.out.println(per2.toString());
        System.out.println(per3.toString());

    }

}
