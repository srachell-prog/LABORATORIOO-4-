package Ejercicio11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Es un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Es un adolescente.");
        } else if (edad >= 18) {
            System.out.println("Es un adulto.");
        } else {
            System.out.println("Edad no válida.");
        }

        entrada.close();
    }
}
