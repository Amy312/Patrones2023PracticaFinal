package ejercicio2;

public class InsAgua extends Instalacion {
    private String lugar;
    private String servicio;
    private float precio;

    public InsAgua(Pago pago, String lugar, String servicio, float precio) {
        super(pago);
        this.lugar = lugar;
        this.servicio = servicio;
        this.precio = precio;
    }


    @Override
    public void showInfo() {
        System.out.println("-->Agua");
        System.out.println("\t- lugar: " + lugar);
        System.out.println("\t- N° trabajadores: " + servicio);
        System.out.println("\t- precio: " + precio);
        System.out.println("\t- tipo de pago: " + getPago().getTipo());
        System.out.println("\t- Total a pagar: " + (precio - getPago().getDescuento()*precio) +"\n");
    }
}
