package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int filas;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca numero de filas: ");
        filas = teclado.nextInt();
        System.out.println();

        for (int numBlancos = filas-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 2) {



            for(int j=1;j<=numAsteriscos;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
