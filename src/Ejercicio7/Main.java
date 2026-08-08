package Ejercicio7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int numero = entrada.nextInt();

            System.out.println("El número ingresado es: " + numero);

        } catch (Exception e) {
            System.out.println("Error: debe ingresar un número.");

        }

        entrada.close();
    }
}