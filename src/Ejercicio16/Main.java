package Ejercicio16;
public class Main {

    public static void main(String[] args) {

        Producto producto1 = new ProductoFisico("Laptop", 5000, 2.5);
        Producto producto2 = new ProductoDigital("Curso de Java", 250, 500);

        producto1.mostrarDatos();

        System.out.println();

        producto2.mostrarDatos();
    }
}
