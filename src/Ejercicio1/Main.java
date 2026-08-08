package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        // Crear objetos
        Animal perro = new Perro("Doki");
        Animal gato = new Gato("Michi");

        // Mostrar comportamiento
        perro.hacerSonido();
        gato.hacerSonido();
    }
}