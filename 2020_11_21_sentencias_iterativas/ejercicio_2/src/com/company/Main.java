package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        n = teclado.nextInt();

        for ( int i=1 ; i <= n ; i++ ) {
            System.out.println(i);
        }
    }
}
