package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ladoA,ladoB;


        Scanner escaner = new Scanner(System.in);

        System.out.print("por favor, introduzca el ladoA del rectangulo:");
         ladoA= escaner.nextInt();
        System.out.print("por favor, introduzca el ladoB del rectangulo:");
         ladoB= escaner.nextInt();

         int areaRectangulo= ladoA * ladoB;
         int perimetroRectangulo= (ladoA*2) + (ladoB*2);

         System.out.println("El resultado del area es: " + areaRectangulo);
         System.out.print("El resultado del perimetro es: " + perimetroRectangulo);


    }
}
