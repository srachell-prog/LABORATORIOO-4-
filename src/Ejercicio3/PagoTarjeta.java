package Ejercicio3;

public class PagoTarjeta extends Pago {

    public PagoTarjeta(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago con tarjeta: Q" + monto);
    }
}