package ejercicio5;

public class AppIOS implements IApp{
    @Override
    public void login() {
        System.out.println("Logueado :3");
    }

    @Override
    public void logout() {
        System.out.println("Salio de la sesión :\"3");

    }

    @Override
    public void reporte() {
        System.out.println("Reportes: todo bien :D");

    }
}
