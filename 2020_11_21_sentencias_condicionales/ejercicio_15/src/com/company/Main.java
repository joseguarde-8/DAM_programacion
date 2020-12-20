package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float numero , numerDos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca dos números");
        System.out.println("----------------------");
        System.out.println("Primer número: ");
        numero = teclado.nextFloat();
        System.out.println("Segundo número: ");
        numerDos = teclado.nextFloat();

        String.format("%.3f", numero);
        String.format("%.3f", numerDos);

        System.out.println(numero + "\s" + numerDos);

        if (numero == numerDos) {
            System.out.println("los decimales son exactos");

        } else {
            System.out.println("los decimales no son exactos");
        }
    }
}
