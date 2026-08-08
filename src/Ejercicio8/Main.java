package Ejercicio8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[5];
        double suma = 0;

        // Pedir las 5 notas
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            suma = suma + notas[i];
        }

        // Calcular promedio
        double promedio = suma / 5;

        System.out.println("El promedio es: " + promedio);

        entrada.close();
    }
}