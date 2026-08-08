package Ejercicio15;

public abstract class Empleado {

    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }

        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularPago();
}