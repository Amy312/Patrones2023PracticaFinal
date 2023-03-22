package ejercicio2;

public abstract class Pago {
    private float descuento;

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public abstract String getTipo();
}
