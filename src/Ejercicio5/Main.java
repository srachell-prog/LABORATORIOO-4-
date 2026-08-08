package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();

            if (edad > 0) {
                System.out.println("Edad válida: " + edad);
            } else {
                System.out.println("La edad debe ser positiva.");
            }

        } catch (Exception e) {
            System.out.println("Error: debe ingresar un número.");
        }

        entrada.close();
    }
}