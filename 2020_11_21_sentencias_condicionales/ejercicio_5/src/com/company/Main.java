package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero , numeroDos , numeroTres;

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduzca el primer número: ");
        numero = teclado.nextInt();

        System.out.println("introduzca el segundo número: ");
        numeroDos = teclado.nextInt();

        System.out.println("introduzca el tercer número: ");
        numeroTres = teclado.nextInt();


        if (numero > numeroDos && numero > numeroTres) {
            System.out.println("el mayor es: " + numero);

        } else if (numeroDos > numero && numeroDos > numeroTres) {
            System.out.println("el mayor es: " + numeroDos);

        } else {
            System.out.println("el mayor es: " + numeroTres);
        }

    }
}
