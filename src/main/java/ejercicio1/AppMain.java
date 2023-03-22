package ejercicio1;

public class AppMain {
    public static void main(String args[]) {
        IPersonaje personaje = new Personaje("Marco");

        personaje = new Arma(personaje, "hacha");
        personaje = new Escudo(personaje);
        personaje = new Pocion(personaje);

        personaje.existir();
        personaje.showInfo();

    }
}