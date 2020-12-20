package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;

        Scanner S = new Scanner(System.in);

        System.out.println("introduzca un numero aleatorio: ");
        numero = S.nextInt();

        String cadena;
        cadena = ( numero > -1) ? "el numero introducido es positivo" : "el numero introducido es negativo";
        System.out.println(cadena);



    }
}
