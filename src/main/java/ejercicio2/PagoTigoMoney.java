package ejercicio2;

public class PagoTigoMoney extends Pago{
    public PagoTigoMoney() {
        this.setDescuento(0.02F);
    }

    @Override
    public String getTipo() {
        return "Tigo Money";
    }
}
