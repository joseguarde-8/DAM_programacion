package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        int lado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("calculo de el area de un triangulo y su perimetro");
        System.out.println("-------------------------------------------------");
        System.out.println("introduzca el lado: ");
        lado = teclado.nextInt();

        double area = ((Math.pow(lado,2) * Math.sqrt(3)) / 4);
        int perimetro = (lado * 3);


        System.out.println("el area del triangulo será: " + area);
        System.out.println("el perimetro del triangulo será: " + perimetro);

    }

}


