package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int edad;

        Scanner teclado = new Scanner(System.in);

        System.out.println("para comprobar si usted puede votar , por favor introduzca su edad: ");
        edad = teclado.nextInt();

        if ( edad > 17) {
            System.out.println("usted es mayor de edad , por lo tanto , puede votar");

        } else {
            System.out.println("usted es menor de edad , por lo tanto , no puede votar");
        }

    }
}
