package ejercicio2;

public class PagoAppEmpresa extends Pago{

    public PagoAppEmpresa() {
        this.setDescuento(0.1F);
    }

    @Override
    public String getTipo() {
        return "App de la empresa";
    }
}
