package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String cadena;
        int contador = 1;
        int longitud;
        int letras = 0;
        int digitos = 0;
        char lectura;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca  un texto compuesto de dígitos y letras: ");
        cadena = teclado.nextLine();

        longitud = cadena.length();

        while (contador < longitud) {
            lectura = cadena.charAt(contador);
            if (Character.isDigit(lectura)) {
                digitos++;
            } else if (Character.isAlphabetic(lectura)) {
                letras++;
            }
            contador++;
        }
        System.out.println("Numeros de letras: " + letras);
        System.out.println("Numeros de digitos: " + digitos);

    }
}
