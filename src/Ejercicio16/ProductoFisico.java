package Ejercicio16;
public class ProductoFisico extends Producto {

    private double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);

        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que 0");
        }

        this.peso = peso;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Producto físico");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: Q" + getPrecio());
        System.out.println("Peso: " + peso + " kg");
    }
}