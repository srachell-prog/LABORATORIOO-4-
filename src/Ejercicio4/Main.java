package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        // Polimorfismo
        Material libro = new Libro("El Principito", "Antoine de Saint-Exupery", 120);

        Material revista = new Revista("National Geographic", "Varios autores", 25);

        libro.mostrarInformacion();

        System.out.println();

        revista.mostrarInformacion();
    }
}