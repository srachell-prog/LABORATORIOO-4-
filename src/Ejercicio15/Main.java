package Ejercicio15;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new EmpleadoTiempoCompleto("Rachell", 5000);
        Empleado empleado2 = new EmpleadoPorHoras("Carlos", 40, 50);

        System.out.println("Empleado: " + empleado1.getNombre());
        System.out.println("Pago: Q" + empleado1.calcularPago());

        System.out.println();

        System.out.println("Empleado: " + empleado2.getNombre());
        System.out.println("Pago: Q" + empleado2.calcularPago());
    }
}
