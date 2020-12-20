package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String word;

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce una palabra: ");
        word = teclado.nextLine();

        if (word.length() != 7 ) {
            System.out.println("\nerror");

        } else {

            if (word.charAt(0) == word.charAt(6) && word.charAt(1) == word.charAt(5) && word.charAt(2) == word.charAt(4)) {
                System.out.println("La palabra es capicua");

            } else {
                System.out.println("La palabra no es capicua");
            }


        }

    }
}
