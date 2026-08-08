package Ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = entrada.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = entrada.nextDouble();

            if (num2 == 0) {
                System.out.println("Error: no se puede dividir entre 0.");
            } else {
                double resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            }

        } catch (Exception e) {
            System.out.println("Error: debe ingresar números válidos.");
        }

        entrada.close();
    }
}
