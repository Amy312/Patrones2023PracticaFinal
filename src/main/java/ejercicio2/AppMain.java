package ejercicio2;

public class AppMain {
    public static void main(String[] args){
        PagoAppEmpresa pagoAppEmpresa = new PagoAppEmpresa();
        PagoTransferencia pagoTransferencia = new PagoTransferencia();
        PagoTigoMoney pagoTigoMoney = new PagoTigoMoney();

        InsElectrica insElectrica1 = new InsElectrica(pagoAppEmpresa, "Av. Siempre Viva", 1200, 1000);
        InsAgua insAgua = new InsAgua(pagoTigoMoney, "Av. Siempre Viva", "Premium", 1400);
        InsAlcantarillado insAlcantarillado = new InsAlcantarillado(pagoTransferencia, "Av. Siempre Viva #12", 12, 10000);

        insElectrica1.showInfo();
        insAgua.showInfo();
        insAlcantarillado.showInfo();

    }
}
