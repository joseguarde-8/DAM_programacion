package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numeroFilas = 0;
        int numeros = 1;
        int contador = 0;
        int numeroMaximo = 9;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca numero de filas: ");
        numeroFilas = teclado.nextInt();

        while (contador <= numeroFilas) {

            for (int i = 0; i < contador; i++) {
                System.out.print(numeros);
                numeros++;

                if (numeros > numeroMaximo) {
                    numeros = 0;
                }
            }
            contador++;
            numeros = 0;

            System.out.println("");

        }
    }
}
