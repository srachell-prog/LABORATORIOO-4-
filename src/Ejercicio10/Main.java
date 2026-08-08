package Ejercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] numeros = new double[5];
        double suma = 0;
        double mayor;
        double menor;

        // Ingresar los 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();

            suma = suma + numeros[i];
        }

        // Inicializar mayor y menor
        mayor = numeros[0];
        menor = numeros[0];

        // Buscar mayor y menor
        for (int i = 1; i < 5; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Calcular promedio
        double promedio = suma / 5;

        System.out.println("\n--- Estadísticas ---");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        entrada.close();
    }
}