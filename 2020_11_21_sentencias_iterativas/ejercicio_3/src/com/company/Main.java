package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n , j=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        n = teclado.nextInt();

        for ( int i=1 ; i <= n ; i++) {
            j = j +i;
            System.out.println(i);
        }

        System.out.println("\n" + j);


    }
}
