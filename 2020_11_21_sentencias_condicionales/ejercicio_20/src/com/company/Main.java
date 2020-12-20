package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double number;

        Scanner teclado = new Scanner(System.in);

        System.out.print("introduce un  número:");
        number = teclado.nextDouble();

        if (number == 0) {
            System.out.println("\nEl número es 0");
        } else if (number < 0) {
            System.out.println("\nEl número es Negativo");
        }else {
            System.out.println("\nEl número es Positivo");
        }

        if (number < 1) {
            System.out.println("\nEl número es Pequeño");
        } else if (number > 1000000){
            System.out.println("\nEl número es Grande");
        }
    }
}
