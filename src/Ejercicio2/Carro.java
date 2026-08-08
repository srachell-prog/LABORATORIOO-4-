package Ejercicio2;
public class Carro extends Vehiculo {

    private int puertas;

    public Carro(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Carro");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Puertas: " + puertas);
    }
}
