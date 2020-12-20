package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        float radio;

        Scanner teclado = new Scanner(System.in);

        System.out.println ("calculo de area y perimetro de una circunferencia segun su radio");
        System.out.println ("----------------------------------------------------------------");
        System.out.println("introduzca el radio: ");
        radio = teclado.nextFloat();

        double area = (Math.pow(radio,2) * 3.14);
        double perimetro = (radio * 2) * 3.14;

        System.out.println("el area de la circunferencia es: " + area);
        System.out.println("el perimetro de la circunferencia es: " + perimetro);
    }
}