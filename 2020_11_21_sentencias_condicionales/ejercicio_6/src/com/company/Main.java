package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("por favor introduzca un numero del 1 al 7 : ");
        numero = teclado.nextInt();

        if (numero == 1) {
            System.out.println("el dia de ls semana es lunes");

        }else if (numero == 2) {
            System.out.println("el dia de ls semana es martes");

        }else if (numero == 3) {
            System.out.println("el dia de ls semana es miercoles");

        }else if (numero == 4) {
            System.out.println("el dia de ls semana es jueves");

        }else if (numero == 5) {
            System.out.println("el dia de ls semana es viernes");

        }else if (numero == 6) {
            System.out.println("el dia de ls semana es sábado");

        }else if (numero == 7) {
            System.out.println("el dia de ls semana es domingo");

        }else {
            System.out.println("vuelva a introducir un numero del 1 al 7");
        }

    }
}
