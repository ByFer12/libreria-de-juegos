package com.mycompany.libreria.de.juegos;

import java.util.Random;
import java.util.Scanner;

public class LibreriaDeJuegos {

    static Scanner ent = new Scanner(System.in);
    static String nombre;

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        int opcion;
        char desicion;
        do {

            do {
                System.out.println("Lista de Juegos");
                System.out.println("1-------Ahorcado");
                System.out.println("2-------Basketball");
                System.out.println("3-------Juego de Cartas");
                System.out.println("4-------Torre de Hanoi");
                System.out.println("5-------Salir");
                System.out.println("Elije una de las opciones");
                opcion = ent.nextInt();
            } while (opcion < 1 || opcion > 5);
            switch (opcion) {

                case 1:
                    ahorcado();
                    break;
                case 2:
                    basketball();
                    break;
                case 3:
                    cartas();
                    break;
                case 4:
                    hanoi();
                    break;
                case 5:
                    opcion = 5;

                    break;

            }

            System.out.println("¿Esta seguro de que quiere salir?: \n S/si  N/no");
            desicion = ent.next().charAt(0);
            System.out.println("");

        } while (desicion == 'n' || desicion == 'N');

    }

    public static void ahorcado() {
        int avance = 0;
        System.out.println("El juego de ahorcado consiste en adivinar letra por letra\n la palabra anteriormente ingresada por un compañero suyo \n El juego termina si se logradibujar una persona ahorcada\n");
        ent.nextLine();
        String palabra, adivinar;
        char letra;
        char[] pal;
        int terminar;
        boolean correcto;
        System.out.println("Ingrese una palabra");
        palabra = ent.nextLine();
        palabra.toLowerCase();
        pal = new char[palabra.length()];
        terminar = palabra.length() + 1;

        do {
            System.out.println("\nPalabra a adivinar: " + " Terminar " + terminar);
            for (int i = 0; i < pal.length; i++) {
                System.out.print(pal[i] + " - ");

            }

            correcto = false;

            System.out.println("\nJugador: ingrese una letra de la palabra a adivinar");
            letra = ent.next().charAt(0);
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    pal[i] += letra;
                    correcto = true;
                }
            }
            //comprueba si la letra ingresada no aparece en el arreglo imprime error
            if (correcto == false) {
                avance++;
                System.out.println("\nLetra incorrecta: ");
                horizontal();
                if (avance == 2) {
                    estanca();

                }
            }

            terminar--;

            String nuevo = String.valueOf(pal);
            if (nuevo.equalsIgnoreCase(palabra)) {
                terminar = 0;

                System.out.println("\nPalabra adivinada: " + " Terminar ");
                for (int i = 0; i < pal.length; i++) {
                    System.out.print(pal[i] + " - ");

                }
            }

        } while (terminar != 0);
        System.out.println("\nGracias por jugar, vuelva pronto");

    }

    public static void basketball() {
        Scanner a = new Scanner(System.in);
        String nombre1, nombre2;
        System.out.println("Bienvenidos a Basketball");
        System.out.println("SE NECESITAN DE DOS JUGADORES");
        System.out.println("El juego consiste en turnos: ");
        System.out.print("\nIngrese el nombre del primer jugador: ");
        nombre1 = a.next();
        System.out.print("Ingrese el nombre de segundo jugador: ");
        nombre2 = a.next();
        System.out.println("Cuantos turnos desean jugar? ");
        int turnos = ent.nextInt();

            int elegirTurno = (int) (Math.random() * 2);
            if (elegirTurno == 0) {
                System.out.println("Turno de: " + nombre1);
            }
            if (elegirTurno == 1) {
                System.out.println("Turno de : " + nombre2);
            }

    }
    
    public static void turnoUno(String nombre){
        int salir;
        do{
            int opcion;
            do{
            System.out.println("1------Salto corto");
            System.out.println("2------Salto largo");
            System.out.println("Elija una opcion");
            opcion=ent.nextInt();
            }while(opcion<1||opcion>2);
            
            
            
            salir=0;
        }while(salir!=0);
    }

    public static void cartas() {
        System.out.println("Bienvenido al casino donde apostamos y ganamos\n");
        System.out.print("Ingrese la cantidad con la que cuentas: ");
        int dinero = ent.nextInt();
        int turnos = 0, carta1, carta2, carta3, apostar;

        do {
            carta1 = (int) (Math.random() * 200);

            System.out.println(" TURNO: " + (turnos + 1) + " Dinero disponible: " + dinero);
            System.out.println("Primera carta " + carta1);
            carta2 = (int) (Math.random() * 300);
            System.out.println("Segunda carta " + carta2);
            apostar = cuanto(dinero);
            carta3 = (int) (Math.random() * 300);
            System.out.println("Tercera carta: " + carta3);
            if ((carta3 >= carta1 && carta3 <= carta2) || (carta3 <= carta1 && carta3 >= carta2)) {
                dinero += apostar;
            } else {
                dinero -= apostar;
            }
            turnos++;

        } while (!(dinero == 0));
        System.out.println("\nSe le acabo su dinero...");
        System.out.println("\nGRACIAS, VUELVA PRONTO");
        System.out.println(nombre + ": Ha perdido todo su dinero, si quiere volver a jugar\ndebe elijir de nuevo en el menu\nsino entonces elija otro juego\n");

    }

    public static int cuanto(int dinero) {
        int apost;
        do {
            System.out.println("Cuanto deseas apostar? ");
            apost = ent.nextInt();
            if (apost > dinero) {
                System.err.println("No puede apostar mas de lo que tiene: ");

            } else if (apost <= 0) {
                System.err.println("Para jugar debe apostar algo: ");
            }
        } while ((apost > dinero) || apost <= 0);

        return apost;
    }

    public static void estanca() {
        for (int i = 0; i < 12; i++) {
            System.out.println("                 *");
        }
    }

    public static void horizontal() {
        for (int i = 0; i < 17; i++) {
            System.out.print("*");
        }
    }

    public static void hanoi() {

    }
}
