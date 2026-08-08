package Ejercicio2;
public class Moto extends Vehiculo {

    private String color;

    public Moto(String marca, String modelo, String color) {
        super(marca, modelo);
        this.color = color;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Moto");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + color);
    }
}