package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberMonth , numberYear;

        Scanner tecclado = new Scanner(System.in);

        System.out.print("Introduce numero de mes:");
        numberMonth = tecclado.nextInt();
        System.out.print("Introduce numero de año:");
        numberYear = tecclado.nextInt();

        if (numberMonth == 1 || numberMonth == 3 || numberMonth == 5 || numberMonth == 7
                || numberMonth == 8 || numberMonth == 10 || numberMonth == 12) {
            System.out.println("El mes tiene 31 días");

        } else if (numberMonth == 4 || numberMonth == 6 || numberMonth == 9 || numberMonth == 11){
            System.out.println("El mes tiene 30 días");

        } else if (numberMonth == 2 && numberYear % 4 == 0 && numberYear % 400 == 0) {
            System.out.println("El mes tiene 29 dias");

        } else {
            System.out.println("El mes tiene 28 dias");
        }


    }
}
