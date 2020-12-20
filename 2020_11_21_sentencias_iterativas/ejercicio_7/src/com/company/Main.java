package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            int cubo = (int) Math.pow(i,3);
            System.out.println(cubo);
        }
    }
}
