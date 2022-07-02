package com.example.tallerjava1.Ejercicio18;
/*

    Implementa los anteriores métodos en las clases Videojuego y Serie.

    Ahora crea una aplicación ejecutable y realiza lo siguiente:

    Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.

    Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
    Entrega algunos Videojuegos y Series con el método entregar().

    Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.

    Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.
    Muéstralos en pantalla con toda su información (usa el método toString()).

     */
public class Ejecutable {
    public static void main(String[] args) {
        Serie series[] = new Serie[5];
        Videojuego videojuegos[] = new Videojuego[5];

        series[0] = new Serie();
        series[1] = new Serie("Los titanes", "Pedro");
        series[2] = new Serie("Porwer Ranger", "Kakarulo");
        series[3] = new Serie("Harry Popotter", 8, "Fantasía", "Bulcaco");
        series[4] = new Serie("The witcher", 23, "Realista", "El raton Perez");

        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Rust", 5300);
        videojuegos[2] = new Videojuego("Lol", 15000);
        videojuegos[3] = new Videojuego("Fornite", 1500, "Battle Royal", "Fuaaa");
        videojuegos[4] = new Videojuego("Wow", 8000, "MMORPG", "Blizzard");

        series[2].entregar();
        series[4].entregar();

        videojuegos[0].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

        //cuento las no entregadas
        int contador = 0;

        for(Serie serie : series){
            if(serie.isEntregado()) {
                contador++;
                serie.devolver();
            }
        }
        for(Videojuego juego : videojuegos){
            if(juego.isEntregado()) {
                contador++;
                juego.devolver();
            }
        }
        //------------------------------
        Videojuego juegoMayor = videojuegos[0];
        for(Videojuego juego : videojuegos) {
            if(juegoMayor.compareTo(juego)){
                juegoMayor = juego;
            }
        }


        Serie serieMayor = series[0];
        for(Serie serie : series) {
            if(serieMayor.compareTo(serie)){
                serieMayor = serie;
            }
        }

        System.out.println("El videojuego con más horas estimadas es: "+juegoMayor.toString());
        System.out.println("La serie con más temporadas es: "+serieMayor.toString());


    }
}
