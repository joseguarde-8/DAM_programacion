package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int año;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Identificador de año bisiesto");
        System.out.println("-----------------------------");
        System.out.println("Introduzca el año: ");
        año = teclado.nextInt();

        if (año % 4 == 0 && año % 400 == 0) {
            System.out.println("El año introucido  es bisiesto");

        } else {
            System.out.println("El año introduido no es bisiesto");
        }

    }
}
