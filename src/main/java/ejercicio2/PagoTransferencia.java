package ejercicio2;

public class PagoTransferencia extends Pago{
    public PagoTransferencia() {
        this.setDescuento(0.05F);

    }

    @Override
    public String getTipo() {
        return "Transferencia bancaria";
    }
}
