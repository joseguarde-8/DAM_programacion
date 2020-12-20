package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numeroUno , numeroDos , numeroTres;

        System.out.println("Introduce tres números crecientes o deccrecientes");
        System.out.println("-------------------------------------------------");

        Scanner teclado = new Scanner(System.in);

        System.out.print("introduzca el primer número: ");
        numeroUno = teclado.nextInt();
        System.out.print("introduzca el segundo número: ");
        numeroDos = teclado.nextInt();
        System.out.print("introduzca el tercer número: ");
        numeroTres = teclado.nextInt();

        if (numeroUno < numeroDos && numeroDos < numeroTres) {
            System.out.println("Resultado: los números son creecies" );

        } else if (numeroUno > numeroDos && numeroDos > numeroTres) {
            System.out.println("Resultado: los números son decreecies" );

        } else {
            System.out.println("Resultado: ni crecientes ni decrecientes");
        }
    }
}
