package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        // Polimorfismo
        Vehiculo carro = new Carro("Toyota", "Corolla", 4);
        Vehiculo moto = new Moto("Honda", "CBR", "Rojo");

        carro.mostrarDatos();

        System.out.println();

        moto.mostrarDatos();
    }
}