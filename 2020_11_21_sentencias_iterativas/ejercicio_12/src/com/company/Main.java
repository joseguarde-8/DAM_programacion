package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numeroFilas;
        int contador = 0;
        int maximo = 9;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        numeroFilas = teclado.nextInt();


        for(int fila = 0; fila <= numeroFilas; fila++) {
            for (int numero = 0; numero <= fila; numero++) {
                System.out.print(contador++);

                if (numero > maximo){
                    contador++;
                    numero = 0;
                }
            }

            System.out.println();
        }
    }
}
