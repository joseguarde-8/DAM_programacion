package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero,j;

        System.out.print("introduzca el numero para saber su tabla: ");
        numero = teclado.nextInt();


        for(j = 1; j <= 10; j++)
        {
            System.out.println(numero + " X " + j + " = " + numero * j);
        }

    }
}
