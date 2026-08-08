package Ejercicio16;
public class ProductoDigital extends Producto {

    private double tamañoArchivo;

    public ProductoDigital(String nombre, double precio, double tamañoArchivo) {
        super(nombre, precio);

        if (tamañoArchivo <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser mayor que 0");
        }

        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Producto digital");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: Q" + getPrecio());
        System.out.println("Tamaño: " + tamañoArchivo + " MB");
    }
}