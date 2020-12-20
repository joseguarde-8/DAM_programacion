package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        number = teclado.nextInt();

        for(int i = 0; i <= number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
