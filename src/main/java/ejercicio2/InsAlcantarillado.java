package ejercicio2;

public class InsAlcantarillado extends Instalacion {
    private String lugar;
    private int trabajadores;
    private float precio;

    public InsAlcantarillado(Pago pago, String lugar, int trabajadores, float precio) {
        super(pago);
        this.lugar = lugar;
        this.trabajadores = trabajadores;
        this.precio = precio;
    }


    @Override
    public void showInfo() {
        System.out.println("-->Alcantarillado");
        System.out.println("\t- lugar: " + lugar);
        System.out.println("\t- N° trabajadores: " + trabajadores);
        System.out.println("\t- precio: " + precio);
        System.out.println("\t- tipo de pago: " + getPago().getTipo());
        System.out.println("\t- Total a pagar: " + (precio - getPago().getDescuento()*precio)+ "\n");
    }
}
