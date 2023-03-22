package ejercicio3;

public class Archivo extends Component{
    private String texto;
    public Archivo(String tipo, String texto) {
        super(tipo);
        setCantidad(texto.split("\\s+").length);
        this.texto = texto;
    }

    @Override
    public void showInfo() {
        System.out.println("--> " + getTipo());
        System.out.println("\t- Texto: " + texto);
        System.out.println("\t- N° de palabras: " + getCantidad());

    }

    @Override
    public void add(Component composite) {

    }

    @Override
    public void remove(Component composite) {

    }

    @Override
    public Component get(int position) {
        return null;
    }
}
