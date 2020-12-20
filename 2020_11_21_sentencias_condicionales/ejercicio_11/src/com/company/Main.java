package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nota;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce la calificacion de la nota");
        System.out.println("------------------------------------");
        System.out.println("Nota: ");
        nota = teclado.nextInt();

        if (nota < 5 && nota > -1) {
            System.out.println("El resultado es SUSPENSO");

        } else if (nota < 11 && nota > 4){
            System.out.println("El resultado es APROVADO");

        } else {
            System.out.println("Calificacion introducida no valida");
        }

    }
}
