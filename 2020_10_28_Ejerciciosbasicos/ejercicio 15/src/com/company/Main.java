package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int añoNacimiento , mesNacimiento , diaNacimiento;
        int añoActual , mesActual , diaActual;

        System.out.println("Indique la fecha actual y la fecha de naimiento");
        System.out.println("-----------------------------------------------");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Año actual: ");
        añoActual = teclado.nextInt();
        System.out.println("Mes actual: ");
        mesActual = teclado.nextInt();
        System.out.println("Dia actual: ");
        diaActual = teclado.nextInt();

        System.out.println("Año de nacimiento: ");
        añoNacimiento = teclado.nextInt();
        System.out.println("Mes de nacimiento: ");
        mesNacimiento = teclado.nextInt();
        System.out.println("Dia de nacimiento: ");
        diaNacimiento = teclado.nextInt();

        System.out.println("Resultado");
        System.out.println("---------");

        System.out.println("Edad actual: " + (añoActual - añoNacimiento) + " años " +
                (mesActual - mesNacimiento) + " meses " + (diaActual - diaNacimiento) + " dias ");

    }
}
