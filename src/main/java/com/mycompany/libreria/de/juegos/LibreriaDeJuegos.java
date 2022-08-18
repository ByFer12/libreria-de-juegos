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
        int terminar, intentos=0;
        boolean correcto;
        System.out.println("Ingrese una palabra");
        palabra = ent.nextLine();
        palabra.toLowerCase();
        pal = new char[palabra.length()];
        terminar = palabra.length() + 1;

        do {
            System.out.println("\nPalabra a adivinar: " + " Intentos " + intentos);
            for (int i = 0; i < pal.length; i++) {
                System.out.print(pal[i] + " - ");

            }
            intentos++;

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
               
                
                if (avance == 1) {
                    System.out.println("Error 1");
                    ahorc1();
                }else if(avance==2){
                     System.out.println("Error 2");
                    ahorc2();
                }else if(avance==3){
                    System.out.println("Error 3");
                    ahorc3();
                }else if(avance==4){
                    System.out.println("Error 4");
                    ahorc4();
                }
                else if(avance==5){
                    System.out.println("Error 5");
                    ahorc5();
                }else if(avance==6){
                    System.out.println("Error 6");
                    ahorc6();
                }
                else if(avance==7){
                    System.out.println("Error 7");
                    ahorc7();
                }
                else if(avance==8){
                    System.out.println("Error 8");
                    ahorc8();
                }else if(avance==9){
                    System.out.println("Error 9");
                    ahorc9();
                }else if(avance==10){
                    System.out.println("Error 10");
                    ahorc10();
                    terminar=0;
                }
                
            }

            //terminar--;

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
    
    public static void ahorc1(){
        System.out.println("*******************");
    }
     public static void ahorc2(){
        System.out.println("*******************");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc3(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc4(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc5(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("    |            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc6(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc7(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("    |            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc8(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("    |_           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc9(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("   _|_           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc10(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("   _|_           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("  GAME OVER!     **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }

    public static void basketball() {
        int puntosUno = 0, puntosdos = 0;
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
        //validamos el numero de turnos
        //encerrar en un bucle los turnos hasta que se acaben los turnos que pidieron
        while (turnos != 0) {
            int elegirTurno = (int) (Math.random() * 2); //aqui elegimos el turno al azar
            System.out.println("Turno: " + turnos);
            switch (elegirTurno) {

                case 0:
                    //etramos al primer turno correspondiente a la primera persona
                    int opcion,
                     salir = 0;
                    do {
                        System.out.println("Turno de: " + nombre1);
                        //Si 
                        do {
                            System.out.println(nombre1 + " Elija una opcion");
                            System.out.println("1------Tiro");
                            System.out.println("2------Defensa");

                            opcion = ent.nextInt();
                        } while (opcion < 1 || opcion > 2);
                        switch (opcion) {
                            case 1:
                                salir++;
                                int option,
                                 exit = 0;
                                do {
                                    System.out.println("1------Salto largo");
                                    System.out.println("2------Salto corto");
                                    option = ent.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            //salto largo
                                            exit++;
                                            int prob1 = (int) (Math.random() * 101);

                                            if (prob1 <= 65) {
                                                puntosUno += 3;
                                                System.out.println(nombre1 + " Puntos: " + puntosUno);

                                            } else {
                                                System.out.println(nombre1 + " Puntos: " + puntosUno);
                                            }

                                            System.out.println(nombre1 + " Haz hecho correctamente tu tiro Largo");
                                            break;
                                        case 2:
                                            //salto corto
                                            exit++;
                                            int prob2 = (int) (Math.random() * 101);
                                            if (prob2 <= 80) {
                                                puntosUno += 2;
                                                System.out.println(nombre1 + " Puntos " + puntosUno);

                                            } else {
                                                System.out.println(nombre1 + " Puntos: " + puntosUno);
                                            }
                                            System.out.println(nombre1 + " Haz hecho correctamente tu tiro Corto");
                                            break;

                                    }
                                } while (exit != 1);

                                break;

                            case 2:
                                //defensa
                                salir++;
                                System.out.println("Defensa: " + nombre1);
                                break;
                        }
                    } while (salir != 2);
                    break;
                case 1:

                    System.out.println("Turno de : " + nombre2);
                    //etramos al primer turno correspondiente a la primera persona

                    int o,
                     sa = 0;
                    do {
                        //Si 
                        do {
                            System.out.println(nombre2 + " Elija una opcion");
                            System.out.println("1------Tiro");
                            System.out.println("2------Defensa");
                            o = ent.nextInt();
                        } while (o < 1 || o > 2);
                        switch (o) {
                            case 1:
                                //tiro
                                sa++;
                                int op,
                                 exit = 0;
                                do {
                                    System.out.println("1------Salto largo");
                                    System.out.println("2------Salto corto");
                                    op = ent.nextInt();
                                    switch (op) {
                                        case 1:
                                            //tiro largo
                                            exit++;
                                            int prob1 = (int) (Math.random() * 101);

                                            if (prob1 <= 65) {
                                                puntosdos += 3;
                                                System.out.println(nombre2 + " Puntos: " + puntosdos);

                                            } else {
                                                System.out.println(nombre2 + " Puntos: " + puntosdos);
                                            }

                                            System.out.println(nombre2 + " Haz hecho correctamente tu tiro Largo");
                                            break;
                                        case 2:
                                            //tiro corto
                                            exit++;
                                            int prob2 = (int) (Math.random() * 101);
                                            if (prob2 <= 80) {
                                                puntosUno += 2;
                                                System.out.println(nombre2 + " Puntos " + puntosdos);

                                            } else {
                                                System.out.println(nombre2 + " Puntos: " + puntosdos);
                                            }
                                            System.out.println(nombre2 + " Haz hecho correctamente tu tiro Corto");
                                            break;

                                    }
                                } while (exit != 1);

                                break;

                            case 2:
                                sa++;
                                System.out.println("Defensa " + nombre2);
                                //defensa
                                break;
                        }
                    } while (sa != 2);
                    break;
            }
            turnos--;
        }
    }
//while(turno!=0);

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

 

    public static void hanoi() {

    }
}
