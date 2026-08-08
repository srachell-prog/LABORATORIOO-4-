package Ejercicio1;

public abstract class Animal {

    // Atributo
    protected String nombre;

    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract void hacerSonido();
}