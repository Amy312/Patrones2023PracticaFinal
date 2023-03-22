package ejercicio2;

public class InsElectrica extends Instalacion {
    private String lugar;
    private int voltaje;
    private float precio;

    public InsElectrica(Pago pago, String lugar, int voltaje, float precio) {
        super(pago);
        this.lugar = lugar;
        this.voltaje = voltaje;
        this.precio = precio;
    }


    @Override
    public void showInfo() {
        System.out.println("-->Electrica");
        System.out.println("\t- lugar: " + lugar);
        System.out.println("\t- Voltaje: " + voltaje);
        System.out.println("\t- precio: " + precio);
        System.out.println("\t- tipo de pago: " + getPago().getTipo());
        System.out.println("\t- Total a pagar: " + (precio - getPago().getDescuento()*precio) + "\n");
    }
}
