package ejercicio2;

public abstract class Instalacion {
    private Pago pago;

    public Instalacion(Pago pago) {
        this.pago = pago;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public abstract void showInfo();
}
