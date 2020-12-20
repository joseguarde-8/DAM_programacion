package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nombre;
        char mayuMin;

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduzca su nombre completo: ");
        nombre = teclado.nextLine();

        Scanner tecladoDos = new Scanner(System.in);

        System.out.println("introduzca una letra: ");
        mayuMin = tecladoDos.next().charAt(0);

        if (mayuMin == 'U' || mayuMin == 'u') {
            System.out.println (nombre.toUpperCase());

        } else if (mayuMin == 'L' || mayuMin == 'l') {
            System.out.println(nombre.toLowerCase());

        } else {
            System.out.println("error. introduzca 'U' o 'u' si desea que su nombre aparezca en mayusculas, o \n, introduzca 'L' o 'l' si desea que su nombre siga igual");
        }


    }
}
