package Ejercicio12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MENÚ ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Seleccione una opción: ");

        int opcion = entrada.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        switch (opcion) {

            case 1:
                System.out.println("Resultado de la suma: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado de la resta: " + (num1 - num2));
                break;

            default:
                System.out.println("Opción no válida.");
        }

        entrada.close();
    }
}
