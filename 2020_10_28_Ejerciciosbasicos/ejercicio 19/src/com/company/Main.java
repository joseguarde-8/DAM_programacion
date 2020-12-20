package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;

        Scanner s = new Scanner(System.in);

        System.out.println("numero: ");
        numero = s.nextInt();
        System.out.println("cuadrado: " + Math.pow(numero,2));

    }
}
