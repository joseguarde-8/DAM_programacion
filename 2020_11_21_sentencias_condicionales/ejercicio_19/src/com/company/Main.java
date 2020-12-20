package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s;

        Scanner teclado = new Scanner(System.in);

        System.out.println("letra del abecedario");
        System.out.println("--------------------");
        System.out.print("Introduce una letra: ");
        s = teclado.nextLine();

        if (s.length() != 1 ) {
            System.out.println("\nerror");

        } else {
           char letra = s.charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("\nHas introducido una vocal");

            } else if  (letra>='A' && letra <='Z' || letra>='a' && letra <='z') {
                System.out.println("\nHas introducido una consonante");

            } else {
                System.out.println("\nerror");

            }

        }

    }
}
