package Ejercicio3;

public class Main {

    public static void main(String[] args) {

        // Polimorfismo
        Pago pago1 = new PagoTarjeta(250);
        Pago pago2 = new PagoEfectivo(100);

        pago1.procesarPago();

        pago2.procesarPago();
    }
}