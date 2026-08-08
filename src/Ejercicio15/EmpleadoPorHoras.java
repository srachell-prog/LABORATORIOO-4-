package Ejercicio15;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double pagoPorHora) {
        super(nombre, 0);

        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas no pueden ser negativas");
        }

        if (pagoPorHora < 0) {
            throw new IllegalArgumentException("El pago por hora no puede ser negativo");
        }

        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * pagoPorHora;
    }
}