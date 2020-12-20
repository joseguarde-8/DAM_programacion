package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        float altura,peso;

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduzca su altura y su peso");
        System.out.println("------------------------------");
        System.out.println("altura: ");
        altura = teclado.nextFloat();
        System.out.println("peso: ");
        peso = teclado.nextFloat();

        double imc = peso / Math.pow(altura,2);

        System.out.println("cálculo de su índice de masa corporal: " + imc);

    }
}
