package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float number , sumaTotal=0 , contador = 0;
        float mediaFinal;

        Scanner tecaldo = new Scanner(System.in);

        while (contador < 5) {
            System.out.print("Introduzca un número: ");
            number = tecaldo.nextFloat();

            if ( number > 0) {
                sumaTotal+=number;

            } else {
                break;
            }
            contador++;
        }

        mediaFinal = sumaTotal / contador;
        System.out.println("\nLa media es: " + mediaFinal);

    }
}
